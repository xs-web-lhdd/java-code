/**
 * ���ʵ�ַ���������Ҫ��ʽ�Ĳ���
 */
public class Test {

  int age;
  void show() {}
  void show(int i) {
    System.out.println("����ǣ�" + i);
  }
  void show(int i, int j) {
    System.out.println("����ǣ�" + i + " " + j);
  }
  void grow() {
    age++;
  }
  void grow(int i) {
    age += i;
  }
  void showAge() {
    System.out.println("�����ǣ�" + age);
  }
  public static void main(String[] args) {
    Test t1 = new Test();

    t1.show();

    Test t2 = new Test();

    t2.show(1);

    Test t3 = new Test();

    t3.show(100, 200);


    t1.grow();
    t1.showAge();

    t2.grow(20);
    t2.showAge();

  }
}