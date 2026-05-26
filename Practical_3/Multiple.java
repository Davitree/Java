package Practical_3;
//WAP to Demonstrate Multiple inheritance 
//No java doesn't support multiple inheritance 
interface Seed{
   public void seed();
     
}
 interface Flower{
  void flower();
 }
 class Tree implements Seed,Flower{
    public void seed(){
      System.out.println("seed");
    }
     public void flower(){
      System.out.println("Flower");
    }
 } 
public class Multiple{
  public static void main(String[] args) {
    Tree obj = new Tree();
    obj.flower();
    obj.seed();
  }
  
}