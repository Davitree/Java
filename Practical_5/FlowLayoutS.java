import java.awt.*;
import javax.swing.*;
public class FlowLayoutS {
  public static void main(String[] args) {
    
   JFrame f = new JFrame("Flow layout");
   f.setLayout(new FlowLayout());
   f.add(new JButton("Button1"));
   f.add(new JButton("Button2"));
   f.add(new JButton("Button3"));
   f.setSize(300,300);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  }

