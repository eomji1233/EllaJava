package org.ella.day05.dimarray;

public class Exam_DimArray {

	public static void main(String[] args) {
		int num = 0; // 변수
		int[] nums = new int[10]; // 배열
		int[][] dimNums = new int[2][5]; // 2차원 배열
		System.out.println("행의 길이 : " + dimNums.length); // 행 세로길이 가로갯수
		System.out.println("열의 길이 : " + dimNums[0].length); // 열 가로길이 세로갯수

		int[][] arrs = new int[2][5];
		int k = 1;
		// 2차원 배열 값 입력하기
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		// for-each문으로 쓰기
		for (int[] arr : arrs) {
			for (int j : arr) {
				System.out.print(j + " ");
			}
			System.out.println();			
		}
			// 그냥 쓰기
			for (int i = 0; i < arrs.length; i++) {
				for (int j = 0; j < arrs[i].length; j++) {
					System.out.print(arrs[i][j] + " ");
				}
				System.out.println();
			}

//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;

		}
	}

