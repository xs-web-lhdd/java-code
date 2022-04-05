/**
 * 实现 Person 类的封装
 */
public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    if(age > 0 && age < 120) this.age = age;
    else System.out.println("年龄不合理，崽崽，你是妖怪吧！");
  }

  // 子类继承父类都会自动调用父类的无参构造方法，来初始化从父类中继承的成员变量，
  // 相当于在构造方法的第一行增加代码 super() 的效果
  public Person() {
    System.out.println("Person() !!!");
  }
  public Person(String name, int age) {
    System.out.println("Person(String name, int age) !!!");
    setName(name);
    setAge(age);
  }

  // 自定义成员方法实现特征的打印
  void show() {
    System.out.println("我是：" + getName() + "，我的年龄是：" + getAge());
  }
  void eat(String food) {
    System.out.println(food + "真好吃！！！");
  }
  void play(String play) {
    System.out.println(play + "真好玩！！！");
  }
}
