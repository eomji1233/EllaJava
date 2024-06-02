package org.ella.self_mini_project;

import java.time.LocalDate;
import java.util.Scanner;

public class ViewTeam {

	Team[] playerList;

	public ViewTeam() {
		playerList = new Team[9];
	}

	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== PLAY BASEBALL GAME! =====");
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 구단 등록");
		System.out.println("2. 선수 등록");
		System.out.println("3. 경기 시작");
		System.out.println("4. 구단 해체");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}

	public Team inputTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구단을 창설하세요!");
		System.out.print("창단일 : ");
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.print("감독 이름 : ");
		String userName = sc.next();
		sc.nextLine();
		System.out.print("구단명 : ");
		String teamName = sc.nextLine();
		System.out.print("연고지 : ");
		String localName = sc.next();
		System.out.print("모기업 : ");
		String company = sc.next();
		Team team = new Team();
		team.setTeamName(teamName);
		return team;
	}

	public Team inputLineup() {
		String[] playerList = new String[9];
		Scanner sc = new Scanner(System.in);
		System.out.println("투수를 정하세요!");
		System.out.print("투수 : ");
		String pitcher = sc.next();
		System.out.println("타순을 배치하세요!");
		for (int i = 0; i < playerList.length; i++) {
			System.out.print(i + 1 + "번 타자 : ");
			String playerName = sc.next();
			playerList[i] = playerName;
		}
		Team lineup = new Team();
		lineup.setPitcher(pitcher);
		lineup.setPlayerList(playerList);
		return lineup;
	}

	public void deleteTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구단을 해체하시겠습니까?");
		System.out.println("1. 예");
		System.out.println("2. 아니요");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("구단을 해체합니다.");
			Team team = new Team();
			team.setTeamName(null);
			team.setPitcher(null);
			team.setPlayerList(null);
//			for (Team players : playerList) {
//				players = null;
				break;
//			}
		case 2:
			System.out.println("메인메뉴로 돌아갑니다.");
		}
	}

	public void displayMessage(String msg) {
		System.out.println(msg);
	}
}
