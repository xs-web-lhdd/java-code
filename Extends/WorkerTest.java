

public class WorkerTest {
  public static void main(String[] args) {
    Worker w1 = new Worker();
    w1.show();

    System.out.println("--------------------------");

    Worker w2 = new Worker("�ŷ�", 100, 2300);
    w2.show();
    w2.eat("��ѿ ");
    w2.play("������ҫ ");
    w2.work();
  }
}
