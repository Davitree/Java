class Teacher {
  void teach(){
    System.out.println("teacher teaches.");
  }
  void scold(){
    System.out.println("teacher scold .");
  }
};

public class TwoClasses {
   void study(){
      System.out.println("Student studies.");
    }
    void play(){
      System.out.println("student plays.");

    }
    
    public static void main(String[] args) {
      Teacher obj = new Teacher();
      obj.teach();
      TwoClasses obj2 = new TwoClasses();
      obj2.play();
    }
    
    
  };
  

   
    
  
   

