import java.util.Scanner; 

public class SimpleCalculator{
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);

    System.out.println("Choose the operation you want: ");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    int Number = Integer.valueOf(var.nextLine());

    System.out.println("Give the first number: ");
    int firstNumber = Integer.valueOf(var.nextLine());
    System.out.println("Give the second number: ");
    int secondNumber = Integer.valueOf(var.nextLine());

    switch(Number){

      case 1:
        System.out.println("sum : " + (firstNumber+secondNumber));
        break;
      case 2:
        System.out.println("Difference : " + (firstNumber-secondNumber));
        break;
      case 3:
        System.out.println("Product : " + (firstNumber*secondNumber));
        break;
      case 4:
        System.out.println("Division : " + (firstNumber/secondNumber));
        break;
            
       }
     
    
    var.close();
  }
}
