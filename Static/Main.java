/**
 * ���ʵ�� main �����Ĳ���
 * java Main �ŷ� ���� �� ���� ����    �������Σ�����
 */


public class Main {

  public static void main(String[] args) {
    System.out.println("����������Ԫ�ظ����ǣ�" + args.length);
    for(int i = 0; i < args.length; i++) {
      System.out.println("��" + (i+1) + "��ʵ���ǣ�" + args[i]);
    }
  }
}
