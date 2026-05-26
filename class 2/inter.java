interface Printable{
  void print();

}
public class inter implements Printable{
  @Override
    public void print(){
      System.out.println("Hello");

    }
  public static void main(String[] args) {
    inter obj = new inter();
    obj.print();
  }
}