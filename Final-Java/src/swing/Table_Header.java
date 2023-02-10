

package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class Table_Header extends JLabel {

    public Table_Header(String text) {
        super(text);
         setOpaque(false);
         setFont(new Font("sansserif", 1, 12));
         setForeground(new Color(102,102,102));
         setBorder(new EmptyBorder(10,5,5,10));

    }
    @Override
     protected void paintComponent(Graphics grphcs) {
         super.paintComponent(grphcs);
         grphcs.setColor(new Color(255,255,255));
         grphcs.drawLine(0,getHeight()-1,getWidth(),getHeight()-1);   
    }
    
    
    
    
}
