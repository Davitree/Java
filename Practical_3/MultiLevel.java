package Practical_3;
class Fruit{
  void fruit(){
    System.out.println("These are fruits.");
  }
}
class Apples extends Fruit{}
class Mango extends Apples{}
public class MultiLevel {
    public static void main(String[] args) {
      Mango obj = new Mango();
      obj.fruit();
    }
  
}
