//WAP to show array index out of bound exception
public class Class3 {
  public static void main(String[] args){
      int arr[] ={1,2,3};
    
      try{
        int c=10/0;
        System.out.println(c);
        System.out.println(arr[5]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("array index out of bounds.");
      }
      catch(ArithmeticException ee){
          System.out.println("I am arithmetic problem"+ee);
      }

  }
}
