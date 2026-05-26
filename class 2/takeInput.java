import java.util.Scanner; 

public class takeInput{
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);

    System.out.println("Give the first number: ");
    int firstNumber = Integer.valueOf(var.nextLine());
    System.out.println("Give the second number: ");
    int secondNumber = Integer.valueOf(var.nextLine());

    System.out.println("The sum of numbers is :" + (firstNumber+secondNumber));

var.close();

  }
}
