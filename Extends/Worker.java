
public class Worker extends Person {
  private int salary;

  public int getSalary() {
    return salary;
  }

  public void setSalay(int salary) {
    if(salary >= 2200) this.salary = salary;
    else System.out.println("нˮ̫��û��ȥ������");
  }

  public Worker() {
    // ��ʾ���ø�����޲ι��췽������дʱ���������Զ�����
    super();
    System.out.println("Worker() �޲Σ�");
  }
  public Worker(String name, int age, int salary) {
    super();
    System.out.println("Worker(String name, int age, int salary) �вΣ�");
    setName(name);
    setAge(age);
    setSalay(salary);
  }

  public void work() {
    System.out.println("�����שͷ�е����֡�����������");
  }
}
