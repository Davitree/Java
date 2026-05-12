public class MethodOverload {
  int sum(int a,int b){
    System.out.println(a+b);
    return 0;
  }
  int greet(){
    System.out.println("GReetings Human!");
    return 0;
  }
  public static void main(String[] args) {
    MethodOverload obj = new MethodOverload();
    obj.greet();
    obj.sum(2,3);
    
  }
}
