package org.ella.day05.dimarray.exercise;

public class Exercise_DimArray {

	public void practice1() {
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= 0; j--) { // k는 그대로 1부터 증가하는데 열을 조작한거임
				arrs[i][j] = k; // 열 위치를 감소시키니까 값도 반대로 들어감
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + "\t"); // 띄어쓰기 일정하게 \t
			}
			System.out.println();
		}
	}

	public void practice2() {
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " " + "\t");

				// for (int arr [] : arrs) {
				// for (int num : arr) {
				// System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

	public void practice3() {

		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " " + "\t");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int k = 1;
		int[][] arrs = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i % 2 != 0) {
				for (int j = 4; j >= 0; j--) {
					arrs[i][j] = k;
					k++;
				}
			} else {
				for (int j = 0; j < 5; j++) {
					arrs[i][j] = k;
					k++;
				}
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " " + "\t");
			}
			System.out.println();
		}
	}
}
