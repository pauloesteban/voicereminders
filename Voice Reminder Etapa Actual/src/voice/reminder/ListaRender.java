
package voice.reminder;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListaRender extends JLabel implements ListCellRenderer{

    final static ImageIcon AlarmaActiva = new ImageIcon("src\\imagenes\\AlarmaActiva.png");
    final static ImageIcon AlarmaDesactivada = new ImageIcon("src\\imagenes\\AlarmaDesactivada.png");
    
    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {
        String valor = e.toString();
        setText(valor);
        setIcon(AlarmaActiva);
        return this;
    }
    
}
