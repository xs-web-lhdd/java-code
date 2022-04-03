import java.util.Scanner;

/**
 * ���ʵ��ѧ����Ϣ��¼��ʹ�ӡ��
 * һ����ʾ�û�����ѧ����������ʹ�ñ�����¼
 * ��������ѧ��������׼����Ӧ��һά����
 * ������ʾ�û������ÿ��ѧ������Ϣ��ѧ�� ����������¼��һά������
 * �ġ���ӡ����ѧ����Ϣ
 */
public class Teacher {
  public static void main(String[] args) {
    System.out.println("������ѧ����������");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    Student[] arr = new Student[num];

    for(int i = 0; i < num; i++) {
      System.out.println("������� " + (i + 1) + "�˵�������ѧ�ţ�����");
      arr[i] = new Student(sc.nextInt(), sc.next());
    }

    arr[0].printLine();

    for(int i = 0; i < num; i++) {
      arr[i].show();
      arr[i].printLine();
    }
  }
}

class Student {
  int id;
  String name;

  Student() {}
  Student(int id, String name) {
    setName(name);
    setId(id);
  }

  void show() {
    System.out.println("�ҵ������ǣ�" + getName() + "���ҵ�ѧ���ǣ�" + getId());
  }

  void printLine() {
    System.out.println("--------------------------------------------");
  }


  public void setId(int id) {
    if(id < 0) {
      System.out.println("���� [bug] " + id + " �����Ǹ���������");
    } else {
      this.id = id;
    }
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  
}
