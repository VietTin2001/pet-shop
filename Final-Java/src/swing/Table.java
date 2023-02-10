
package swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Table  extends JTable{

    public Table() {
          setShowHorizontalLines(true);
          setGridColor(new Color(230,230,230));
          setRowHeight(40);
          getTableHeader().setReorderingAllowed(false);
          getTableHeader().setBackground(Color.WHITE);
          getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1){
                    Table_Header header= new Table_Header(o+"");
                    if(i1==5){
                        header.setHorizontalAlignment(JLabel.CENTER);
                    }
                    return header;
          }});
         setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
             @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1){
                if(i1!=5){
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    setBackground(Color.WHITE);
                    if(selected){
                        com.setForeground(new Color(15,89,140));
                    }
                    else{
                        com.setForeground(new Color(102,102,102));
                    }
                    return com;
                }
                return new JLabel("");
            }
         });
         
    
    }
}
