package org.ella.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_CodeRead {
	public static void main(String[] args) {
		// Exam_ImageCopy.java 파일을 읽어서 콘솔로 출력해보세요!
		// 문자기반 스트림
		// 1. 입력스트림 사용
		//	- 문자 배열 이용
		// 2. 파일의 경로를 파악
		// 3. System.out.println() 으로 출력
		//	- 읽은 것은 문자열로 만들기
		//	- 누적합
		// 4. 자원해제
		Reader reader = null;
		try {
			reader = new FileReader("src/org/ella/day15/stream/exercise/Exam_ImageCopy.java");
			int readCount;
			char [] cBuf = new char[1024];
			String result = "";
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				result += new String(cBuf, 0, readCount);
			}
			System.out.println(result); // 표준 출력방법인 콘솔이라 OutStream, Write 필요없음
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
