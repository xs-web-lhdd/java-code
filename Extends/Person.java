/**
 * ʵ�� Person ��ķ�װ
 */
public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    if(age > 0 && age < 120) this.age = age;
    else System.out.println("���䲻�������̣��������ְɣ�");
  }

  // ����̳и��඼���Զ����ø�����޲ι��췽��������ʼ���Ӹ����м̳еĳ�Ա������
  // �൱���ڹ��췽���ĵ�һ�����Ӵ��� super() ��Ч��
  public Person() {
    System.out.println("Person() !!!");
  }
  public Person(String name, int age) {
    System.out.println("Person(String name, int age) !!!");
    setName(name);
    setAge(age);
  }

  // �Զ����Ա����ʵ�������Ĵ�ӡ
  void show() {
    System.out.println("���ǣ�" + getName() + "���ҵ������ǣ�" + getAge());
  }
  void eat(String food) {
    System.out.println(food + "��óԣ�����");
  }
  void play(String play) {
    System.out.println(play + "����棡����");
  }
}
