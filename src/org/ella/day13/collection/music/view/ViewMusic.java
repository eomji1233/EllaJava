package org.ella.day13.collection.music.view;

import java.util.List;
import java.util.Scanner;

import org.ella.day13.collection.music.model.Music;

public class ViewMusic {

	private Scanner sc;

	public ViewMusic() {
		sc = new Scanner(System.in);
	}

	public int printMenu() {
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 정보 수정");
		System.out.println("6. 특정 곡 삭제");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	public Music addMusicList() {
		sc.nextLine();
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer); // 써야 저장됨
		return music;
	}

	public void displayMusic(List<Music> mList) {
		System.out.println("=== === 음악 정보 출력 === ===");
		for (Music music : mList) {
			System.out.printf("\t곡 : %s\n", music.getTitle());
			System.out.printf("\t가수 : %s\n", music.getSinger());
			System.out.println("==============================");
		}
	}

	public void displayMsg(String msg) {
		System.out.println(msg);
	}

	public String inputTitle(String category) {
		System.out.print(category + "할 곡명 : ");
		String name = sc.next();
		return name;
	}

	public Music modifyMusic(Music music) {
		sc.nextLine();
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		music.setTitle(title);
		music.setSinger(singer);
		return music;
	}

}
