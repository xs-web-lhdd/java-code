public class People {
  public static void main(String[] args) {
    PeopleTest p1 = new PeopleTest("张飞", 100);
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
      System.out.println("崽崽 你不是人吧！");
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
    System.out.println("我的名字是： " + name + "，我的年龄是： " +  age);
  }
  static void allShow() {
    System.out.println("我是地痞小流氓，我咣咣撞大墙！！！");
  }
}
