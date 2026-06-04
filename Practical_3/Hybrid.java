package Practical_3;

class Ant extends Elephant{
  void ant(){
    System.out.println("ant is an insect");
  }
}
class Bat extends Ant{
  void bat(){
    System.out.println("bat is a mammal");
  }
}
class Cat extends Bat  {

}
public class Hybrid {
  public static void main(String[] args) {
    Bat b = new Bat();
    b.ant();
    Cat c = new Cat();
    c.bat();
    Ant a = new Ant();
    a.elephant();
  }
}
