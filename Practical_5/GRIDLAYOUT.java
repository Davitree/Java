import javax.swing.*;
import java.awt.*;
public class GRIDLAYOUT {
    public static void main(String[] args) {
      JFrame f = new JFrame("Grid Layout");
      f.setLayout(new GridLayout(2,3));
      f.add(new JButton("1"));
      f.add(new JButton("2"));
      f.add(new JButton("3"));
      f.add(new JButton("4"));
      f.add(new JButton("5"));
      f.add(new JButton("6"));
      f.setSize(300,500);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
