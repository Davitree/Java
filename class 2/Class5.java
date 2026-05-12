public class Class5 {
  public static void main(String[] args) {
    try{
      System.out.println(2/0);
    }
    catch(ArithmeticException e){
      System.out.println("Cannot divide by zero." + e.getMessage());
    }
    finally{
      System.out.println("this block will always run.");
    }
  }
  
}
