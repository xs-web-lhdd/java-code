public class People {
  public static void main(String[] args) {
    PeopleTest p1 = new PeopleTest("�ŷ�", 100);
    p1.show();
    p1.allShow();
  }
}



class PeopleTest {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setAge(int age) {
    if(age > 0 && age < 120) {
      this.age = age;
    } else {
      System.out.println("���� �㲻���˰ɣ�");
    }
  }
  public int getAge() {
    return this.age;
  }

  PeopleTest() {}
  PeopleTest(String name, int age) {
    setName(name);
    setAge(age);
  }

  void show() {
    System.out.println("�ҵ������ǣ� " + name + "���ҵ������ǣ� " +  age);
  }
  static void allShow() {
    System.out.println("���ǵ�ƦС��å��������ײ��ǽ������");
  }
}
