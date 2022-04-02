public class Person {
  String name;
  int age;

  void show() {
    System.out.println("我是：" + name + "，今年" + age + "岁了！");
  }
  // void setName(String s) {
  //   name = s;
  // }
  // void setAge(int n) {
  //   age = n;
  // }

  void setNameAndAge(String n, int a) {
    name = n;
    age = a;
  }
  void showStringArgs(String ... args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println("第" + i + "个参数是" + args[i]);
    }
  }
  void showIntArgs(int ... args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println("第" + i + "个参数是" + args[i]);
    }
  }
  void printLine() {
    System.out.println("---------------------------------");
  }

  int getAge() {
    return age;
  }
  String getName() {
    return name;
  }
  public static void main(String[] args) {
    Person p = new Person();
    p.show();

    p.setNameAndAge("张三", 100);

    p.show();

    p.printLine();

    p.showStringArgs("111", "4789");

    p.printLine();

    p.showIntArgs(100, 200, 300, 400);

    p.printLine();

    System.out.println("拿到年龄：" + p.getAge());
    System.out.println("拿到名字：" + p.getName());
  }
}
