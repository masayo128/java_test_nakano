package Test20240118_nakano;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		//配列をセット
		int[] group1 =  {12,2,300,4,5,6};
		int[] group2 =  {110,18,13,1400,15,16};
		
		System.out.println("①２つの配列を表示↓\n");
		System.out.println("②group1:" + Arrays.toString(group1));
		System.out.println("  group2:" + Arrays.toString(group2));
		
		//group1の最大値・最小値を出す
		int max1 = findMaxValue(group1);
		int min1 = findMinValue(group1);
		
		System.out.println("\n③group1の最大値・最小値");
		System.out.println("  最大値：" + max1);
		System.out.println("  最小値：" + min1);
		
		//group2の最大値・最小値を出す
		int max2 = findMaxValue(group2);
		int min2 = findMinValue(group2);
		
		System.out.println("\n③group2の最大値・最小値");
		System.out.println("  最大値：" + max2);
		System.out.println("  最小値：" + min2);

	}

	//関数で配列の最大値を求めるメソッド
	public static int findMaxValue(int[] arr) {
		int max = arr[0];	//初期値を配列の最初の要素に設定
		
		//配列をループして最大値を見つける
		for ( int i = 1 ; i < arr.length; i++) {
			if ( arr[i] > max ) {
				max = arr[i] ;
			}
		}
		
		return max;
	}

	//関数で配列の最小値を求めるメソッド
		public static int findMinValue(int[] arr) {
			int min = arr[0];	//初期値を配列の最初の要素に設定
			
			//配列をループして最大値を見つける
			for ( int i = 1 ; i < arr.length; i++) {
				if ( arr[i] < min ) {
					min = arr[i] ;
				}
			}
			
			return min;
		}
}
