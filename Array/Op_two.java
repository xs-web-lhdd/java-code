public class Op_two {
	public static void main(String [] args) {
		int arr [] = new int[]{11, 22, 33, 44, 55};

		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr �±�Ϊ" + i + "��Ԫ�أ� " + arr[i]);
		}
		System.out.println("--------------------------------------");
		int brr[] = new int[3];
		for(int i = 0; i < brr.length; i++) {
			System.out.println("brr �±�Ϊ" + i + "��Ԫ�أ� " + brr[i]);
		}		
		System.out.println("--------------------------------------");
		// java �ٷ��� copy:
		// System.arraycopy(arr, 1, brr, 0, 3);
		// �Լ��ֶ�����:
		// for(int i = 1; i < arr.length-1; i++) {
		// 	brr[i-1] = arr[i];
		// }
		for(int i = 0; i < brr.length; i++) {
			System.out.println("brr �±�Ϊ" + i + "��Ԫ�أ� " + brr[i]);
		}
	}
}

