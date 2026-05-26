package Practical_3;
//Wap to demonstrate single inheritance 
class Apple{
  void greet(){
    System.out.println("Hello");
  }
}
public class SingleInheritance extends Apple {
  
  public static void main(String[] args) {
    SingleInheritance obj = new SingleInheritance();
    obj.greet();

  }
}
