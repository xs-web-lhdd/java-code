public class Singleton {
  public static void main(String[] args) {
    SingletonTest s1 = SingletonTest.getInstance();
    SingletonTest s2 = SingletonTest.getInstance();

    System.out.println(s1 == s2);
  }
}


class SingletonTest {
  private SingletonTest() {}

  private static SingletonTest sin = new SingletonTest();

  static public SingletonTest getInstance() {
    return sin;
  }
}