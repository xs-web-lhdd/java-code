
public class Student {
  public static void main(String[] args) {
    StudentTest s1 = new StudentTest();
    s1.setName("�ŷ�");
    s1.setAge(-100);
    s1.show();
    s1.printLine();

    StudentTest s2 = new StudentTest("����", -10);
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
    System.out.println("�ҵ������ǣ�" + getName() + "���ҵ������ǣ�" + getAge());
  }

  void printLine() {
    System.out.println("--------------------------------------------");
  }

  public void setAge(int age) {
    if(age < 0) {
      System.out.println("���� [bug] " + age + " �����Ǹ���������");
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