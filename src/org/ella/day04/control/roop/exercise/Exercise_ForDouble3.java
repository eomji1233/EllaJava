package org.ella.day04.control.roop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String[] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆엔 4단 세로로 출력
		for (int i=1; i<10; i++) {
			for (int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
		
		for (int n=1; n<10; n++) {
			for (int f=2; f<10; f++) {
				System.out.print(f + "*" + n + "=" + n*f);
				System.out.print("\t"); // 출력하고 탭만큼 공간주기
			}	
			System.out.println(); // 끝에서 개행 한번 해주고
		}
	}
}
