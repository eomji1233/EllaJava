package org.ella.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		// 저장할 파일 입력(확장자 제외) : snow
		// 종료는 exit
		// 1 : 오늘은
		// 2 : 눈이
		// 3 : 옵니다.
		// 4 : 펑펑
		// 5 : 옵니다.
		// 6 : exit
		// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
		// snow.txt -> 오늘은 \n 눈이 \n 옵니다 \n 펑펑 \n 옵니다
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력(확장자 제외) : "); // 가이드 메시지
		String fileName = sc.nextLine();						// 파일명 입력받음
		Writer writer = null;									// 출력스트림 준비
		try {
			writer = new FileWriter("src/org/ella/day15/stream/exercise/" + fileName + ".txt"); // 경로 세팅
			System.out.println("종료는 exit");
			for (int i = 1;; i++) {
				System.out.print(i + " : ");
				String input = sc.nextLine();		// 저장할 데이터 입력
				if ("exit".equals(input)) break;	// NullpointException 방지
				writer.write(input + "\n");			// 해당 경로 파일에 저장
				writer.flush();						// 버퍼비우기
			}										
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
