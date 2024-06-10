package org.ella.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
//		InputStream is = new InputStream(); 추상클래스라 객체 안만들어짐
		InputStream is = null;
		int readByte;
		try {
			is = new FileInputStream("src/org/ella/day15/stream/inputstream/reading.txt");
			do {
				readByte = is.read(); // 한 글자씩 읽는 메소드, 입력 스트림으로부터 1바이트를 읽고, 읽은 바이트를 리턴
				System.out.print((char)readByte);				
			} while(readByte != -1); // 읽을게 없으면 -1이 출력됨
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
