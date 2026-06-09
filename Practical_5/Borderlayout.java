import javax.swing.*;
import java.awt.*;
public class Borderlayout {
  public static void main(String[] args) {
    JFrame f = new JFrame("Border Layout");
    f.setLayout(new BorderLayout());
    f.add(new JButton("SOUTH"),BorderLayout.SOUTH);
    f.add(new JButton("EAST"),BorderLayout.EAST);
    f.add(new JButton("WEST"),BorderLayout.WEST);
    f.add(new JButton("NORTH"),BorderLayout.NORTH);
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
}
