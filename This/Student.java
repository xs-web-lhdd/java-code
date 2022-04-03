
public class Student {
  public static void main(String[] args) {
    StudentTest s1 = new StudentTest();
    s1.setName("张飞");
    s1.setAge(-100);
    s1.show();
    s1.printLine();

    StudentTest s2 = new StudentTest("关羽", -10);
    s2.show();
  }
}


class StudentTest {
  public String name;
  public int age;

  StudentTest() {}
  StudentTest(String name, int age) {
    setName(name);
    setAge(age);
  }

  void show() {
    System.out.println("我的名字是：" + getName() + "，我的年龄是：" + getAge());
  }

  void printLine() {
    System.out.println("--------------------------------------------");
  }

  public void setAge(int age) {
    if(age < 0) {
      System.out.println("警告 [bug] " + age + " 不能是负数！！！");
    } else {
      this.age = age;
    }
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
}