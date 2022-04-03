/**
 * 编程实现累乘积的计算并打印
 */
public class JieCheng {

  // 一、递推的方式：
  // int show(int n) {
  //   int num = 1;
  //   for(int i = 1; i <= n; i++) {
  //     num *= i;
  //   }
    
  //   return num;
  // }

  // 二、递归的方式：
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
