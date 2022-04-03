/**
 * 编程实现 Boy 类的实现
 */
public class Boy {
  String name;

  Boy() {
    // 调用有参方法
    // this("无名！");
    System.out.println("无参构造方法！");
  }
  Boy(String name) {
    this();
    System.out.println("有参构造方法！");
    this.name = name;
  }
  void show() {
    System.out.println("我的名字是： " + name);
  }
  void printLine() {
    System.out.println("--------------------------");
  }
  public static void main(String[] args) {
    Boy b1 = new Boy();
    b1.show();
    b1.printLine();
    Boy b2 = new Boy("张飞");
    b2.show();
    b2.printLine();
    // Boy b3 = null; // 编译 OK 运行时报异常
    // b3.show();
    Boy b3 = b2;
    b3.show();
  } 
}
