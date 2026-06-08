
import java.awt.*;

public class Awt{
  public static void main(String[] args) {
    Frame f = new Frame("Awt example");
    Button b = new Button("click me");
    b.setBounds(100,100,80,40);
    f.add(b);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
  }
  
}
