public class cube {
  int Cube (int n){
    int res = n * n * n;
    return res;
  }
public static void main(String[] args) {
  cube obj = new cube();
  System.out.println(obj.Cube(10));
}
}