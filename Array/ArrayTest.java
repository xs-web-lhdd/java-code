public class ArrayTest {
	/*
		�����Ĭ��ֵ��
		�������͵����飨����Ԫ��Ϊ�������ͣ���������Ԫ�صĳ�ʼֵ�� byte short char int long Ϊ 0��float double Ϊ 0.0 boolean Ϊ false 
	*/
	public static void main(String [] args) {
		System.out.println("-------------------------------------------------");
		// ����һ: δ��ʼ��!
		int [] arr1 = new int[10]; 
		int arr2 [] = new int[20];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println("arr1 �±�Ϊ 0 ��Ԫ�أ� " + arr1[0]);
		for(int i = 0; i < arr1.length; i++) {
			// int ����Ĭ��ȫ�� 0
			System.out.println("arr11 �±�Ϊ" + i + "��Ԫ�أ� " + arr1[i]);
		}

		double[] arr3 = new double[5];
		for(int i = 0; i < arr3.length; i++) {
			// double Ĭ��ȫ�� 0.0
			System.out.println("arr3 �±�Ϊ" + i + "��Ԫ�أ� " + arr3[i]);
		}
		System.out.println("-------------------------------------------------");

		// ������: ��ʼ��! ��̬��ʽ�ļ򻯰�
		char arr4 [] = {'a', 'b', 'c', 'd'};
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4 �±�Ϊ" + i + "��Ԫ�أ� " + arr4[i]);
		}
		System.out.println("-------------------------------------------------");

		// �����д��: ��̬��ʽ������
		boolean [] arr5 = new boolean[]{true, true, false, false};
		for(int i = 0; i < arr5.length; i++) {
			System.out.println("arr5 �±�Ϊ" + i + "��Ԫ�أ� " + arr5[i]);
		}
	}
}

