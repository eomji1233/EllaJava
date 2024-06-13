package org.ella.day17.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattingServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 9999; // 확인
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			socket = serverSocket.accept();
			is = socket.getInputStream();
			os = socket.getOutputStream(); 
			dis = new DataInputStream(is); 
			dos = new DataOutputStream(os); 
			System.out.println("클라이언트와 연결이 되었습니다.");
			while(true) {
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // 보내는거 한쌍
				if("end".equals(sendMsg)) {
					System.out.println("채팅이 종료되었습니다.");
					break;
				}
				dos.flush();
				
				String recvMsg = dis.readUTF(); // 받는거 한쌍
				System.out.println("클라이언트(상대) : " + recvMsg);				
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
