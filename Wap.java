// // Wap to create two different methods in a class name 
// HelloWorld
// Method name (show and display)
// one with return type void and another with return type int
// 1.one by creating a single class
// 2.by creating two different classes 
class Help{
  void display(){
    System.out.println("Hello World new class");

  }
}
public class Wap{
  void display(){
    System.out.println("Hello World");
  }
  int Show(){
    System.out.println("This is Show");
    return 0;
  }
  public static void main(String[] args){
    Wap obj = new Wap();
    obj.display();
   int r = obj.Show();
   System.out.println(r);
    Help obj_new = new Help();
    obj_ 
    new.display();
  }
}