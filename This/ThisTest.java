public class ThisTest {

  String name;
  int age;
  ThisTest() {
    System.out.println("���췽����this��" + this);
  }
  ThisTest(String n, int a) {
    name = n;
    age = a;
  }
  void show() {
    System.out.println("�ҵ������ǣ�" + this.name + "���ҵ������ǣ�" + this.age);
  }
  public static void main(String[] args) {
    ThisTest tt1 = new ThisTest("�ŷ�", 10000);
    ThisTest tt2 = new ThisTest("����", 5000);

    tt1.show();

    System.out.println("=======================");

    tt2.show();
    // System.out.println("main ������ tt��" + tt);

    // tt.show();


  }
}
