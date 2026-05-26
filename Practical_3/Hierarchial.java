package Practical_3;
//WAP to show hierarchial 
class Vehicle {
  void vehicle() {
    System.out.println("This is a vehicle.");
  }

}

class Honda extends Vehicle {

}

class Hero extends Vehicle {
}

public class Hierarchial {
  public static void main(String[] args) {
    Honda obj1 = new Honda();
    Hero obj2 = new Hero();
    obj1.vehicle();
    obj2.vehicle();

  }
}
