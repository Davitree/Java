class Help{
  Help(){
    System.out.println("Help");
  }
}
private class Class1{
  Class1(){
    System.out.println("constructor demo");
  }
  Class1(int a){
    System.out.println("constructor demo"+a);
    
  }
  private static void main(){
    Class1 obj = new Class1();
  }
    Class1 obj1 = new Class1(10);
}