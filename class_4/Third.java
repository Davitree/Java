package class_4;

public class Third implements First , Second {

  @Override
  public void show(){
    System.out.println("Show");
  }
  public void display(){
    System.out.println("Display");
  }

  @Override 
  public void second(){
    System.out.println("Second");
  }
  public static void main(String[] args) {
    Third obj = new Third();
    obj.show();
    obj.display();
    obj.second();
  }

  
}
