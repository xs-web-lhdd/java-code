public class Person {
  String name;
  int age;

  void show() {
    System.out.println("���ǣ�" + name + "������" + age + "���ˣ�");
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
      System.out.println("��" + i + "��������" + args[i]);
    }
  }
  void showIntArgs(int ... args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println("��" + i + "��������" + args[i]);
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

    p.setNameAndAge("����", 100);

    p.show();

    p.printLine();

    p.showStringArgs("111", "4789");

    p.printLine();

    p.showIntArgs(100, 200, 300, 400);

    p.printLine();

    System.out.println("�õ����䣺" + p.getAge());
    System.out.println("�õ����֣�" + p.getName());
  }
}
