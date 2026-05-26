import java.util.Scanner; 
public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);

    System.out.println("Give the first number: ");
    int Number = Integer.valueOf(var.nextLine());

    System.out.println("The sum of n natural numbers is :"+ (Number*(Number+1)/2));


  var.close();
    
  }
}
