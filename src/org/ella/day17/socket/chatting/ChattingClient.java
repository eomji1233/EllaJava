package org.ella.day17.socket.chatting;

import java.io.*; // 하나로 퉁치기!
import java.net.*;
import java.util.*;

public class ChattingClient {
	public static void main(String[] args) {
		String address = "192.168.60.217";
		int port = 9999; // 확인***
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			is = socket.getInputStream(); // 이걸 소켓에서 가져오는거니까
			os = socket.getOutputStream(); // new 안씀***
			dis = new DataInputStream(is); // 이건 보조스트림 생성이라
			dos = new DataOutputStream(os); // new 씀 주 스트림을 전달값으로 받음
			System.out.println("서버와 연결이 완료되었습니다!");
			while (true) {
				String recvMsg = dis.readUTF(); // 받는거 한쌍
				if ("end".equals(recvMsg)) {
					System.out.println("채팅이 종료되었습니다.");
					break;
				}
				System.out.print("서버(상대) : " + recvMsg);
				System.out.println();

				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // 보내는거 한쌍
				dos.flush(); // 쓴 다음에 버퍼 비워주는거니까 반복 같이 해주기
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
