/* 
  编程实现构造块和代码块的使用
*/


public class Test {
  // 可将构造方法体之前做一些准备性的工作，可以将代码放到构造块里面
  {
    System.out.println("构造块！");
  }

  // 随着类的加载就已准备运行！！！先执行，静态代码块只执行一次，构造块会执行多次
  // 当需要在执行代码块之前随着类的加载做一些准备工作时，则编写代码到静态代码块中，比如：数据库的驱动包等。
  static {
    System.out.println("静态代码块！！！");
  }
  Test() {
    System.out.println("---------构造方法！");
  }
  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
  }
}
