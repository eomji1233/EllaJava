package org.ella.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;


public class BaseBallClient {
	public static void main(String[] args) {
		// 클라이언트 소켓을 생성하였습니다.
		// 게임 준비 완료
		// 숫자 입력(띄어쓰기로 구분) ex 1 2 3
		// --> 2 3 6
		// 0스트라이크 0볼
		// 숫자 입력(띄어쓰기로 구분) ex 1 2 3
		// --> 1 3 6
		// 1스트라이크 0볼
		// 숫자 입력(띄어쓰기로 구분) ex 1 2 3
		// --> 1 4 6
		// 2스트라이크 0볼
		// 숫자 입력(띄어쓰기로 구분) ex 1 2 3
		// --> 6 4 1
		// 1스트라이크 1볼
		// 숫자 입력(띄어쓰기로 구분) ex 1 2 3
		// --> 5 1 4
		// 0스트라이크 3볼
		// 숫자 입력(띄어쓰기로 구분) ex 1 2 3
		// --> 1 4 5
		// 3스트라이크 0볼
		// 아웃! 게임종료!
		String address = "127.0.0.1";
		int port = 8282;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("클라이언트가 소켓을 생성하였습니다.");
			System.out.println("게임 준비 완료");
			while(true) {
				System.out.println("숫자 입력(띄어쓰기로 구분) ex 1 2 3");
				System.out.print("--> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				if("3스트라이크 0볼".equals(recvMsg)) {
					System.out.println("아웃! 게임종료!");
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
