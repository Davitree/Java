package classfriday;

class parent{
 parent(){
    System.out.println("parent ");
 }
}
class child extends parent {
  child(){
    super();
  }
}

public class SuperClassConstructor {
   public static void main(String[] args) {
    child obj = new child();

   }
}
