/**
 * ���ʵ���۳˻��ļ��㲢��ӡ
 */
public class JieCheng {

  // һ�����Ƶķ�ʽ��
  // int show(int n) {
  //   int num = 1;
  //   for(int i = 1; i <= n; i++) {
  //     num *= i;
  //   }
    
  //   return num;
  // }

  // �����ݹ�ķ�ʽ��
  int show(int i) {
    if(i == 1) return 1;
    else {
      return this.show(i-1) * i;
    }
  }
  public static void main(String[] args) {
    JieCheng jct = new JieCheng();
    int res = jct.show(5);
    System.out.print(res);
  } 
}
