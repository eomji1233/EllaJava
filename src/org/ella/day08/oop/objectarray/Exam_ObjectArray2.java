package org.ella.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		// 여러 개의 책이 존재하는데 그 책의 정보를 여러개 저장하려고 함.
		// 책은 3권까지 저장할 수 있도록 하고 제목과 저자만 입력받아 저장할 수 있는
		// 프로그램을 출력해봥
		// 제목 >> 어린왕자
		// 저자 >> 생택쥐베리
		// 제목 >> 춘향전
		// 저자 >> 작자 미상
		// (어린왕자, 생택쥐베리)
		// (춘향전, 작자 미상)
		Book[] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		// 객체 배열 입력
		for (int i = 0; i < books.length; i++) {
			System.out.print(">> ");
			String title = sc.nextLine(); // 엔터랑 띄워쓰기도 입력받음
			System.out.print(">> ");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
			// cArrs[i] = book;
		}
		// 객체 배열 출력
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}
}