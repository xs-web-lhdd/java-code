public class Op_one {
	public static void main(String [] args) {
		int arr [] = new int[5];

		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr 下标为" + i + "的元素： " + arr[i]);
		}
		System.out.println("--------------------------------------");
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = (i+1) * 11;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr 下标为" + i + "的元素： " + arr[i]);
		}
		System.out.println("--------------------------------------");
		for(int i = arr.length-1; i >= 0 ; i--) {
			if(i > 0) {
				arr[i] = arr[i-1];
			}
			else {
				arr[0] = 55;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr 下标为" + i + "的元素： " + arr[i]);
		}
		System.out.println("--------------------------------------");
		for(int i = 0; i < arr.length; i++) {
			if(i < 4) {
				arr[i] = arr[i+1];
			}
			else {
				arr[4] = 0;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr 下标为" + i + "的元素： " + arr[i]);
		}
		System.out.println("--------------------------------------");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 22) arr[i] = 220;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr 下标为" + i + "的元素： " + arr[i]);
		}
	}
}

