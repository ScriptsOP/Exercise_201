
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julian
 */
public class VelocityTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable arg0, Object arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        Measurement m = (Measurement) arg1;
        JLabel label = new JLabel();
        label.setOpaque(true);
        int vel = m.getVelMeasured();
        Color c = null;
        
        if (vel >= 30){
            c = Color.RED;
        } else if (vel >= 20){
            c = Color.ORANGE;
        } else if (vel >= 10){
            c = Color.YELLOW;
        } else {
            c = Color.BLUE;
        }
        
        label.setBackground(c);
        return label;
    }
    
    
}
