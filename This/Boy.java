/**
 * ���ʵ�� Boy ���ʵ��
 */
public class Boy {
  String name;

  Boy() {
    // �����вη���
    // this("������");
    System.out.println("�޲ι��췽����");
  }
  Boy(String name) {
    this();
    System.out.println("�вι��췽����");
    this.name = name;
  }
  void show() {
    System.out.println("�ҵ������ǣ� " + name);
  }
  void printLine() {
    System.out.println("--------------------------");
  }
  public static void main(String[] args) {
    Boy b1 = new Boy();
    b1.show();
    b1.printLine();
    Boy b2 = new Boy("�ŷ�");
    b2.show();
    b2.printLine();
    // Boy b3 = null; // ���� OK ����ʱ���쳣
    // b3.show();
    Boy b3 = b2;
    b3.show();
  } 
}
