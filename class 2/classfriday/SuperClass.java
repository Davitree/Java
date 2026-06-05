package classfriday;
class Parent{
  String result = "pass";

}
class Child extends Parent {
  void showResult(){
    System.out.println("You "+super.result);
  }
}
public class SuperClass {
public static void main(String[] args) {
  Child obj = new Child();
obj.showResult();
}

  
}

