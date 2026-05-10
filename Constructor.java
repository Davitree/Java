// WAP to show the constructor overloading in java 
public class Constructor{
  String name;
  int age;
  
  Constructor(int a){
    age = a;
    System.out.println("The age is:"+a);
  }
  Constructor(int a,String n){
    age= a;
    name = n;
    System.out.println("The name is:" + n);
    System.out.println("The age is:"+ a);
  }
  public static void main(String[] args){
Constructor obj1 = new Constructor(10);
Constructor obj2 = new Constructor(10,"Davit");
  }
}