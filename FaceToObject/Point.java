
public class Point {
  int x;
  int y;
  void print() {
    System.out.println("x: ºá×ø±ê" + x + "y: ×Ý×ø±ê" + y);
  }
  void setX(int n) {
    x = n;
  }
  void setY(int m) {
    y = m;
  }
  public static void main(String[] args) {
    Point p = new Point();
    p.print();
    System.out.println("-------------------------------------------");
    
    // p.x = 3;
    // p.y = 5;
    p.setX(100);
    p.setY(000);

    p.print();
  }
}