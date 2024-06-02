package org.ella.self_mini_project;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		ViewTeam view = new ViewTeam();
		StartGame gm = new StartGame();
		while (true) {
			int menu = view.mainMenu();
			switch (menu) {
			case 1:
				// 구단 등록
				Team team = view.inputTeam();
				break;
			case 2:
				// 선수 등록
				Team lineup = view.inputLineup();
				break;
			case 3:
				// 경기 시작
				Team game = gm.manageGame();
				break;
			case 4:
				// 구단 해
				view.deleteTeam();
				break;
			default:
				view.displayMessage("1 ~ 4 사이의 숫자를 입력해!");
			}

		}
	}
}
