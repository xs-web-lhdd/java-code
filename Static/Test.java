/* 
  ���ʵ�ֹ����ʹ�����ʹ��
*/


public class Test {
  // �ɽ����췽����֮ǰ��һЩ׼���ԵĹ��������Խ�����ŵ����������
  {
    System.out.println("����飡");
  }

  // ������ļ��ؾ���׼�����У�������ִ�У���̬�����ִֻ��һ�Σ�������ִ�ж��
  // ����Ҫ��ִ�д����֮ǰ������ļ�����һЩ׼������ʱ�����д���뵽��̬������У����磺���ݿ���������ȡ�
  static {
    System.out.println("��̬����飡����");
  }
  Test() {
    System.out.println("---------���췽����");
  }
  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
  }
}
