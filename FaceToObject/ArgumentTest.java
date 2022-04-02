public class ArgumentTest {

  void show(int ia) {
    // ia = 0;
    System.out.println("show 方法中： ia = " + ia);
  }
  void printLine() {
    System.out.println("---------------------------");
  }

  void showArr(int[] arr) {
    arr[0] = 1000000;
    System.out.println("show 方法中：arr[0] = " + arr[0]);
  }
  public static void main(String[] args) {
    int ib = 10;
    ArgumentTest a = new ArgumentTest();

    a.show(100);

    a.printLine();

    a.show(ib);

    a.printLine();

    int[] arr2 = new int[]{10, 20};
    a.showArr(arr2);
    System.out.println(arr2[0]);
  }
}
