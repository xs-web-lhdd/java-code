public class Point {
  int x;
  int y;

  Point() {}

  Point(int m, int n) {
    x = m;
    y = n;
  }

  void show() {
    System.out.println("�������ǣ�" + x + "���������ǣ�" + y);
  }
  public static void main(String[] args) {
    Point p1 = new Point();

    p1.show();

    Point p2 = new Point(100, 100);

    p2.show();

    Point p3 = new Point(200, 200);

    p3.show();
  }
}
