import javax.swing.*;
import java.awt.*;

class Test
{
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(() -> {
        
            JFrame  frame = new JFrame();
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            String hashColor = "#28a745";
            
            Color color = Color.decode(hashColor);
            
            JLabel label = new JLabel("Color");
        
            label.setBackground(color);
            
            label.setOpaque(true);
            
            // frame.getContentPane().add(label);
            
            frame.add(label);
            
            frame.setSize(100,100);
            
            // frame.setLocationRelativeTo(null);
            
            frame.setVisible(true);
        
        });
    
    }
}
/*

#155724
#d4edda
#c3e6cb

#721c24
#f8d7da
#f5c6cb

#ffffff
#0069d9
#0062cc

*/
