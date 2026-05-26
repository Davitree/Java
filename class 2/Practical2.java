public class Practical2 {
  Practical2(){
      System.out.println("I am practicing java");
  }

  Practical2(int a, float b){
    float sum=a+b;
    System.out.println("The sum of numbers="+sum);
  }
  public static void main(String[] args) {
    Practical2 p=new Practical2();
    Practical2 pp =new Practical2(2,3.3f);
    
  }
  
}

