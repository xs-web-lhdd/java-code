public class ArrayTest {
	/*
		数组的默认值：
		基本类型的数组（数据元素为基本类型）创建后，其元素的初始值： byte short char int long 为 0；float double 为 0.0 boolean 为 false 
	*/
	public static void main(String [] args) {
		System.out.println("-------------------------------------------------");
		// 声明一: 未初始化!
		int [] arr1 = new int[10]; 
		int arr2 [] = new int[20];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println("arr1 下标为 0 的元素： " + arr1[0]);
		for(int i = 0; i < arr1.length; i++) {
			// int 类型默认全是 0
			System.out.println("arr11 下标为" + i + "的元素： " + arr1[i]);
		}

		double[] arr3 = new double[5];
		for(int i = 0; i < arr3.length; i++) {
			// double 默认全是 0.0
			System.out.println("arr3 下标为" + i + "的元素： " + arr3[i]);
		}
		System.out.println("-------------------------------------------------");

		// 声明二: 初始化! 静态方式的简化版
		char arr4 [] = {'a', 'b', 'c', 'd'};
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4 下标为" + i + "的元素： " + arr4[i]);
		}
		System.out.println("-------------------------------------------------");

		// 特殊的写法: 静态方式完整版
		boolean [] arr5 = new boolean[]{true, true, false, false};
		for(int i = 0; i < arr5.length; i++) {
			System.out.println("arr5 下标为" + i + "的元素： " + arr5[i]);
		}
	}
}

