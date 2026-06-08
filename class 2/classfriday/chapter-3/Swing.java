import javax.swing.*;
public class Swing {
    public static void main(String[] args){
      JFrame f = new JFrame("Components and containers");
      JLabel  label= new JLabel("sample");
      label.setBounds(80,50,200,30);
      f.add(label);
      f.setSize(300,200);
      f.setLayout(null);

      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
