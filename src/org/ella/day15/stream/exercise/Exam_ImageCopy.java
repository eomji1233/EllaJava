package org.ella.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// C:\Windows\Web\Wallpaper\Theme1\img2.jpg를
		// C:\Temp\copyimg.jpg에 복사하겠다!
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Theme1\\img2.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			byte [] byteImages = new byte[1024];
			int readCount;
			while(true) {
				readCount = is.read(byteImages);
				if(readCount == -1) break;
				os.write(byteImages, 0, readCount); // 배열의 길이만큼 읽을 수 있도록 추가
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
