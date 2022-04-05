/**
 * 编程实现 main 方法的测试
 * java Main 张飞 关羽 马超 赵云 黄忠    这样传参！！！
 */


public class Main {

  public static void main(String[] args) {
    System.out.println("参数数组中元素个数是：" + args.length);
    for(int i = 0; i < args.length; i++) {
      System.out.println("第" + (i+1) + "个实参是：" + args[i]);
    }
  }
}
