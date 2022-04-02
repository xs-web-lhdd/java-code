import java.util.Scanner;

public class Op_three {
	public static void main(String [] args) {
		System.out.println("请输入一个正整数!!!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int arr[] = new int[10];

		while(num > 0) {
			arr[num % 10] ++;
			num = num / 10;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

