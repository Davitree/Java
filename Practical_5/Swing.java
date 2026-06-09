import javax.swing.*;
public class Swing{
  public static void main(String[] args) {
      JFrame f = new JFrame("Components and Container");
      JButton btn = new JButton("Click me.");
      f.add(btn);
      f.setSize(300,200);
      f.setLayout(null);
      btn.setBounds(100,100,100,100);
      f.setVisible(true);
      btn.setText("hgfff");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
