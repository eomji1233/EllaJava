package org.ella.day05.dimarray.exercise;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		// 5 4 3 2 1 
		// arrs[0][4] arrs[0][3] arrs[0][2] arrs[0][1] arrs[0][0] 
		// 10 9 8 7 6 
		// 15 14 13 12 11 
		// 20 19 18 17 16 
		// 25 24 23 22 21 
		
		int k = 1;
		int [][] arrs = new int[5][5];
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >=0 ; j--) { 	// k는 그대로 1부터 증가하는데 열을 조작한거임
				arrs[i][j] = k;				// 열 위치를 감소시키니까 값도 반대로 들어감
				k++;
			}
		}
		for (int i = 0; i<arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + "\t"); // 띄어쓰기 일정하게 \t
			}
			System.out.println();
		}
	}
}
