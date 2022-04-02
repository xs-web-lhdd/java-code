import java.util.Scanner;

public class Op_four {
	public static void main(String [] args) {
		System.out.println("请输入学生人数!!!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 声明数组记录成绩: 
		int scores[] = new int[num];

		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i+1) + "个学生的成绩:");
			scores[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		System.out.println("学生的总成绩是: " + sum);
		System.out.println("学生的平均成绩是: " + sum/10);
	}
}

