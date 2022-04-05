
public class Worker extends Person {
  private int salary;

  public int getSalary() {
    return salary;
  }

  public void setSalay(int salary) {
    if(salary >= 2200) this.salary = salary;
    else System.out.println("薪水太低没人去！！！");
  }

  public Worker() {
    // 表示调用父类的无参构造方法，不写时编译器会自动加上
    super();
    System.out.println("Worker() 无参！");
  }
  public Worker(String name, int age, int salary) {
    super();
    System.out.println("Worker(String name, int age, int salary) 有参！");
    setName(name);
    setAge(age);
    setSalay(salary);
  }

  public void work() {
    System.out.println("今天的砖头有点烫手。。。。。。");
  }
}
