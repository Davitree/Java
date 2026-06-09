import java.awt.*;
import javax.swing.*;

public class CARDLAYOUT {
 public static void main(String[] args) {
 JFrame f = new JFrame("Card Layout") ;
 CardLayout c = new CardLayout();
 JPanel p = new JPanel();
 p.setLayout(c);
 p.add(new JButton("2"));
 p.add(new JButton("2"));
//  p.add(new JButton("3"));
 f.add(p);
 f.setSize(300,200);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }  
}
