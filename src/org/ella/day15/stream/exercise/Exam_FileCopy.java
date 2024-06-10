package org.ella.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		// C드라이브에 있는 파일을 D드라이브로 복사해보자
		// C:\Temp\face.png -> D:\copy\copied.png
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Temp\\face.png");
			os = new FileOutputStream("D:\\copy\\copied.png");
			byte[] byteImages = new byte[1024]; // 이미지라서 바이트 기반 스트림 사용
			int readCount;
			while ((readCount = is.read(byteImages)) != -1) {
				os.write(byteImages, 0, readCount);
				os.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
