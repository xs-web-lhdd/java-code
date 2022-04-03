public class ThisTest {

  String name;
  int age;
  ThisTest() {
    System.out.println("构造方法！this：" + this);
  }
  // ThisTest(String n, int a) {
  //   name = n;
  //   age = a;
  // }
  ThisTest(String name, int age) {
    this.name = name;
    this.age = age;
  }
  void show() {
    System.out.println("我的名字是：" + this.name + "，我的年龄是：" + this.age);
  }
  ThisTest getPerson() {
    return this;
  }
  public static void main(String[] args) {
    ThisTest tt1 = new ThisTest("张飞", 10000);
    ThisTest tt2 = new ThisTest("关羽", 5000);

    tt1.show();

    System.out.println("=======================");

    tt2.show();
    // System.out.println("main 方法中 tt：" + tt);

    // tt.show();

    ThisTest tt3 = tt1.getPerson();
    System.out.println(tt1 == tt3);

  }
}
