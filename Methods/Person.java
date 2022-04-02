public class Person {
  String name;
  int age;
  
  Person(String n, int a) {
    name = n;
    age = a;
  }
  Person() {}

  void show() {
    System.out.println("我是" + name + "，今年" + age + "岁了！");
  }
  public static void main(String[] args) {
    Person p1 = new Person("张飞", 100);

    p1.show();

    Person p2 = new Person("李明", 20);

    p2.show();

    Person p3 = new Person();

    p3.show();
  }
}
