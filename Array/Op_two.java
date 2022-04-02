public class Op_two {
	public static void main(String [] args) {
		int arr [] = new int[]{11, 22, 33, 44, 55};

		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr 下标为" + i + "的元素： " + arr[i]);
		}
		System.out.println("--------------------------------------");
		int brr[] = new int[3];
		for(int i = 0; i < brr.length; i++) {
			System.out.println("brr 下标为" + i + "的元素： " + brr[i]);
		}		
		System.out.println("--------------------------------------");
		// java 官方的 copy:
		// System.arraycopy(arr, 1, brr, 0, 3);
		// 自己手动操作:
		// for(int i = 1; i < arr.length-1; i++) {
		// 	brr[i-1] = arr[i];
		// }
		for(int i = 0; i < brr.length; i++) {
			System.out.println("brr 下标为" + i + "的元素： " + brr[i]);
		}
	}
}

