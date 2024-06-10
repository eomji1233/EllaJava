package org.ella.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;
		int readCount;
		String result = "";
		try {
			is = new FileInputStream("src/org/ella/day15/stream/inputstream/reading.txt");
			byte [] readBytes = new byte[3]; // 3개씩 끊어서 읽는다
			while(true) {
				readCount = is.read(readBytes); // readCount에는 읽은 개수가 들어간다
				if(readCount == -1) break;
				result += new String(readBytes, 0, readCount); // 뭉탱이 자체를 문자열 자체로 바꾸는 방법
			}		
			System.out.println(result);				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
