package org.ella.day05.Random.exercise;

import java.util.Scanner;

public class Exercise_Random3_Copy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		int result = 0;
		String comNum = null;
		while (true) {
			int computer = (int) (Math.random() * 3);
			System.out.println("가위 바위 보 게임을 시작합니다.");
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String input = sc.nextLine();
			System.out.println("당신은 " + input + "를 냈습니다");
			switch (input) {
			case "가위":
				inputNum = 0;
				break;
			case "바위":
				inputNum = 1;
				break;
			case "보":
				inputNum = 2;
				break;
			}
			switch (computer) {
			case 0:
				comNum = "가위";
				break;
			case 1:
				comNum = "바위";
				break;
			case 2:
				comNum = "보";
				break;
			}
			System.out.println("컴퓨터는 " + comNum + "를 냈습니다.");
			
			if (inputNum == computer) {
				System.out.println("비겼습니다. 다시 시작합니다");
			} else if ((inputNum == 0 && computer == 2) || (inputNum == 1 && computer == 2)
					|| (inputNum == 2 && computer == 1)) {
				System.out.println("당신이 이겼습니다!");
				break;
			} else if ((inputNum == 0 && computer == 1) || (inputNum == 1 && computer == 0)
					|| (inputNum == 2 && computer == 0)) {
				System.out.println("당신이 졌습니다!");
				break;
			}
		}
	}
}
