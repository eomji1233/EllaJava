package org.ella.day05.dimarray.exercise;

public class Exercise_DimArray2 {

	public static void main(String[] args) {
		// 5 10 15 20 25 
		// 4 9 14 19 24 
		// 3 8 13 18 23 
		// 2 7 12 17 22 
		// 1 6 11 16 21 
		// arrs[4][0] arrs[3][0] arrs[2][0] arrs[1][0] arrs[0][0] 행이랑 열을 반대로 생각하자
		// arrs[4][1] arrs[3][1] arrs[2][1] arrs[1][1] arrs[0][1] 콤마 앞이 y축으로 생각해
		
		int k = 1;
		int [][] arrs = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >=0 ; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i<arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " " + "\t");
				
		// for (int arr [] : arrs) {
				// for (int num : arr) {
					// System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}
