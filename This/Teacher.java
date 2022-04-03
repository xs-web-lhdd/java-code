import java.util.Scanner;

/**
 * 编程实现学生信息的录入和打印：
 * 一、提示用户输入学生的人数并使用变量记录
 * 二、根据学生的人数准备对应的一维数组
 * 三、提示用户输入的每个学生的信息（学号 姓名）并记录到一维数组中
 * 四、打印所有学生信息
 */
public class Teacher {
  public static void main(String[] args) {
    System.out.println("请输入学生的人数：");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    Student[] arr = new Student[num];

    for(int i = 0; i < num; i++) {
      System.out.println("请输入第 " + (i + 1) + "人的姓名和学号！！！");
      arr[i] = new Student(sc.nextInt(), sc.next());
    }

    arr[0].printLine();

    for(int i = 0; i < num; i++) {
      arr[i].show();
      arr[i].printLine();
    }
  }
}

class Student {
  int id;
  String name;

  Student() {}
  Student(int id, String name) {
    setName(name);
    setId(id);
  }

  void show() {
    System.out.println("我的名字是：" + getName() + "，我的学号是：" + getId());
  }

  void printLine() {
    System.out.println("--------------------------------------------");
  }


  public void setId(int id) {
    if(id < 0) {
      System.out.println("警告 [bug] " + id + " 不能是负数！！！");
    } else {
      this.id = id;
    }
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  
}
