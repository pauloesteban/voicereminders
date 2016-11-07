
package voice.reminder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class Grabar extends JFrame{

  AudioFormat audioFormat;
  TargetDataLine targetDataLine;

  final JButton captureBtn =
                          new JButton("Capture");
  final JButton stopBtn = new JButton("Stop");

  final JPanel btnPanel = new JPanel();
  final ButtonGroup btnGroup = new ButtonGroup();
  
  final JRadioButton waveBtn =
                        new JRadioButton("WAVE");

  public static void main( String args[]){
    new Grabar();
  }

  public Grabar(){
    captureBtn.setEnabled(true);
    stopBtn.setEnabled(false);

    
    captureBtn.addActionListener(
      new ActionListener(){
        public void actionPerformed(
                                  ActionEvent e){
          captureBtn.setEnabled(false);
          stopBtn.setEnabled(true);
          //Capture input data from the
          // microphone until the Stop button is
          // clicked.
          captureAudio();
        }//end actionPerformed
      }//end ActionListener
    );
    stopBtn.addActionListener(
      new ActionListener(){
        public void actionPerformed(
                                  ActionEvent e){
          captureBtn.setEnabled(true);
          stopBtn.setEnabled(false);

          targetDataLine.stop();
          targetDataLine.close();
        }
      }
    );

    getContentPane().add(captureBtn);
    getContentPane().add(stopBtn);

    btnGroup.add(waveBtn);

    btnPanel.add(waveBtn);

    //getContentPane().add(btnPanel);

    getContentPane().setLayout(new FlowLayout());
    setTitle("Copyright 2003, R.G.Baldwin");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300,120);
    setVisible(true);
  }

  private void captureAudio(){
    try{
      
      audioFormat = getAudioFormat();
      DataLine.Info dataLineInfo =
                          new DataLine.Info(
                            TargetDataLine.class,
                            audioFormat);
      targetDataLine = (TargetDataLine)
               AudioSystem.getLine(dataLineInfo);

      new CaptureThread().start();
    }catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
  private AudioFormat getAudioFormat(){
    float sampleRate = 8000.0F;
    
    int sampleSizeInBits = 16;
    
    int channels = 1;
   
    boolean signed = true;
    
    boolean bigEndian = false;
        return new AudioFormat(sampleRate,
                           sampleSizeInBits,
                           channels,
                           signed,
                           bigEndian);
  }
class CaptureThread extends Thread{
  public void run(){
    AudioFileFormat.Type fileType = null;
    File audioFile = null;

      fileType = AudioFileFormat.Type.WAVE;
      audioFile = new File("recordatorio.wav");
      int cuenta=0;
      while (audioFile.exists()){
      audioFile= new File(String.format("recordatorio_%d.wav",++cuenta));
       }
       

    try{
      targetDataLine.open(audioFormat);
      targetDataLine.start();
      AudioSystem.write(
            new AudioInputStream(targetDataLine),
            fileType,
            audioFile);
    }catch (Exception e){
      e.printStackTrace();
    }

  }
}

}