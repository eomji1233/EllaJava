package org.ella.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {

	public void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		// ex. 1 2 3 4 5 6 7 8 9 10
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (i + 1);
			System.out.print(nums[i] + " ");
		}
	}

	public void practice2() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (10 - i);
			System.out.print(nums[i] + " ");
		}
	}

	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		// ex. 양의 정수 : 5, 1 2 3 4 5
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] nums = new int[input];
		for (int i = 0; i < input; i++) {
			nums[i] = (i + 1);
			System.out.print(nums[i] + " ");
		}
	}

	public void practice4() {
		// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요.
		// ex. 귤

//				String [] fruits = new String[5];
//					fruits[0] = "사과";
//					fruits[1] = "귤";
//					fruits[2] = "포도";
//					fruits[3] = "복숭아";
//					fruits[4] = "참외";
//				System.out.println(fruits[1]);

		String[] fruits = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(fruits[1]);

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}
	}

	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String object = sc.next();
		int count = 0;
		// int size = object.length(); // "문자열".length() 하면 ""안에 문자열의 길이가 구해짐. 이 경우 3이
		// 나옴
		char[] words = new char[object.length()]; // 만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가짐

		for (int i = 0; i < object.length(); i++) {
			words[i] = object.charAt(i); // 입력받은 문자열을 문자 하나하나 배열에 넣기
											// "문자열".charAt(0) 하면 ""안에 문자열 중 0번째에 해당하는 문자를 가져옴. 이 경우 '문'이 구해짐
		}

		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0); // 검색할 문자 입력받기. 입력한 문자열에서 무조건 첫번째 문자를 구해줌
		System.out.print(object + "에 " + search + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < words.length; i++) { // 배열.length 하면 배열의 크기가 구해짐. 배열이면 다 가능
			if (words[i] == search) {
				System.out.print(search + " ");
				count++;
			}
		}
	}

	public void practice6() {
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록 하고
		// 0 ~ 6 이 외에 숫자를 입력하면 잘못 입력하셨습니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		String[] day = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num < 0 || num > 6) {
			System.out.print("잘못 입력하셨습니다롱");
		} else {
			System.out.print(day[num]);
		}
	}

	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//				

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			arr[i] = input;
			sum += input;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("총합 : " + sum);
	}

	public void practice8() {

		// 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		// 다시 정수를 받도록 하세요.
//				ex.
//				정수 : 4
//				다시 입력하세요.
//				정수 : -6
//				다시 입력하세요.
//				정수 : 5
//				1, 2, 3, 2, 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		if (num < 3 || num % 2 == 0) {
			System.out.print("다시 입력하세요");
		} else {
			for (int i = 1; i < (arr.length + 1) / 2; i++) {
				arr[i] = i + 1;
			}
			for (int j = ((arr.length + 1) / 2) + 1; j > 0; j--) {
				arr[j] = j;
			}
			for (int nums : arr) {
				System.out.print(nums);
			}
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char[] idNums = new char[idNum.length()];
		for (int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i); // 하나씩 잘라서 넣는거!!!!!!!!!!!
		}
		char[] copy = new char[idNum.length()];
		for (int i = 0; i < idNums.length; i++) {
			// copy[i] = idNums[i];
			if (i < 8) {
				copy[i] = idNums[i];
			} else {
				copy[i] = '*';
			}
		}
		for (char i : copy) { // for-each문 쓸 때 배열의 데이터타입 쓰고 변수 자체설정!
			System.out.print(i);
		}
	}
}
