//wap to demonstrate single try with multiple catch
public class Class4{
  public static void main(String[] args) {
    try{
      // int a
      // System.out.println(2/2);
      System.out.println(2/0);
    }
    catch(Exception e){
      System.out.println("Cannot divide by zero.");
    }
    // catch( ee){
    //   System.out.println("Cannot divide by zero second.");
    // }
    
    
  }
}