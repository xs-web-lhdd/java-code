import java.util.Scanner;

public class Op_four {
	public static void main(String [] args) {
		System.out.println("������ѧ������!!!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// ���������¼�ɼ�: 
		int scores[] = new int[num];

		for(int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i+1) + "��ѧ���ĳɼ�:");
			scores[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		System.out.println("ѧ�����ܳɼ���: " + sum);
		System.out.println("ѧ����ƽ���ɼ���: " + sum/10);
	}
}

