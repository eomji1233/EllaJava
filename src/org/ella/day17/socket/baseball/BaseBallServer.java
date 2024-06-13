package org.ella.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;

public class BaseBallServer {
	public static void main(String[] args) {
		// 서버소켓을 생성하였습니다.
		// 클라이언트의 접속을 기다립니다.
		// 클라이언트가 접속했습니다.
		// 1 4 5
		// 서버 준비 완료
		// 받기 : 2 3 6
		// 받기 : 1 3 6
		// 받기 : 1 4 6
		// 받기 : 6 4 1
		// 받기 : 5 1 4
		// 받기 : 1 4 5
		ServerSocket serverSocket = null;
		int port = 8282;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			System.out.println("클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random rand = new Random();
			System.out.println("클라이언트가 접속했습니다.");
			System.out.println("서버 준비 완료");
			int result1 = rand.nextInt(9) + 1;
			int result2 = rand.nextInt(9) + 1;
			int result3 = rand.nextInt(9) + 1;
			int [] result = { result1, result2, result3 };
			for (int results : result) {
				System.out.print(results + " ");
			}
			while (true) {
				String recvMsg = dis.readUTF();
				System.out.println();
				System.out.println("받기 : " + recvMsg);
				String[] num = recvMsg.split(" ");
				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);
				int num3 = Integer.parseInt(num[2]);
				String sendMsg;
				int ballCount = 0;
				int strikeCount = 0;
				if (num1 == result1) {
					strikeCount++;
				}
				if (num2 == result2) {
					strikeCount++;
				}
				if (num3 == result3) {
					strikeCount++;
				}
				if (num1 == result2 || num1 == result3) {
					ballCount++;
				}
				if (num2 == result1 || num1 == result3) {
					ballCount++;
				}
				if (num3 == result1 || num1 == result2) {
					ballCount++;
				}
				sendMsg = (strikeCount + "스트라이크 " + ballCount + "볼");
				dos.writeUTF(sendMsg);
				dos.flush();
				
				if (strikeCount == 3) {
					sendMsg = ("아웃! 게임종료!");
					break;
				}
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
