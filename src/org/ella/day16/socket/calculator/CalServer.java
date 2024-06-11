package org.ella.day16.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {
//	연결을 기다리고 있습니다...
//	연결이 완료되었습니다.
//	24 + 42
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("연결을 기다리고 있습니다...");
			socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다.");
			is = socket.getInputStream(); 			// 받는 곳이 인풋
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os); 		// 담은건 전달값으로 사용
			while(true) {
				String recvMsg = dis.readUTF(); 		// 24 + 42
				// 1. 필요에 의해서 나누어야 함.
				String result = "";
				String [] data = recvMsg.split(" ");	// 띄워쓰기를 기준으로 나누기
				int num1 = Integer.parseInt(data[0]);
				int num2 = Integer.parseInt(data[2]);					// + 다음이니까 3번째 차례
				String operator = data[1];
				switch(operator) {
				case "+" : 
					result = (num1) + (num2) + "";	// 형 변환해주니까 result 타입불일치 
					break;							// 뒤에 ""붙여서 String으로 변환
				case "-" : 
					result = (num1) - (num2) + "";	
					break;
				case "*" : 
					result = (num1) * (num2) + "";	
					break;
				case "/" : 
					result = (num1) / (num2) + "";	
					break;
				case "%" : 
					result = (num1) % (num2) + "";	
					break;
				}
				// 2. 나눈 것을 연산
				// 3. 결과를 result에 담기
//			result = num1 + num2; 					// 이대로 두면 스트링이라 2442가 나옴
				
				dos.writeUTF(result);					
				dos.flush();
				System.out.println(recvMsg);		
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
