package org.ella.day05.Random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random3 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int computer = (int) (Math.random() * 3);
			System.out.println("가위 바위 보 게임을 시작합니다.");
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String input = sc.nextLine();
			System.out.println("당신은 " + input + "을 냈습니다.");
			switch (input) {
			case "가위": {
				if (computer == 0) {
					System.out.println("당신이 졌습니다!");
				} else if (computer == 1) {
					System.out.println("당신이 이겼습니다!");
				} else if (computer == 2) {
					System.out.println("비겼습니다. 다시 시작합니다.");
				}
				break;

			}
			case "바위": {
				if (computer == 0) {
					System.out.println("당신이 이겼습니다!");
				} else if (computer == 1) {
					System.out.println("비겼습니다. 다시 시작합니다.");
				} else if (computer == 2) {
					System.out.println("당신이 졌습니다!");
				}
			}
				break;

			case "보": {
				if (computer == 0) {
					System.out.println("비겼습니다. 다시 시작합니다.");
				} else if (computer == 1) {
					System.out.println("당신이 졌습니다!");
				} else if (computer == 2) {
					System.out.println("당신이 이겼습니다!");
				}
			}
				break;

			}
		}
	}
}