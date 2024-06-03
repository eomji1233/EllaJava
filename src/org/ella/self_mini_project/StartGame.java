package org.ella.self_mini_project;

import java.util.Random;
import java.util.Scanner;

public class StartGame {

	public Team manageGame() {
		Scanner sc = new Scanner(System.in);
		int myScore = 0;
		int otherScore = 0;
		System.out.println("===== 경기 시작 =====");
		int[] inning = new int[9];
		System.out.println(Team.getTeamName() + "와 카카오 드림즈의 경기를 시작합니다!");
		int j = 0; // j는 0으로 초기화해서 1번 타자부터 순차적으로 진행되게 만든다
		for (int i = 1; i < inning.length + 1; i++) {
			int outCount = 0;
			int hitPlayer = 0;
			int fourBall = 0;
			int runPlayer = 0;
			System.out.println("-" + i + "회 초" + "-");
			Random rand = new Random();
			int randSc = rand.nextInt(2);
			otherScore += randSc;
			try {
				System.out.println("*");
				Thread.sleep(1000); // 1초 지연
				System.out.println("*");
				Thread.sleep(1000); // 1초 지연
				System.out.println("*");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("투수 " + Team.getPitcher() + " " + randSc + " 실점");
			System.out.println(Team.getPitcher() + " : " + myScore + " 드림즈 : " + otherScore);
			System.out.println("=====================");

			System.out.println("-" + i + "회 말" + "-");
			System.out.println("현재스코어 " + myScore + ":" + otherScore);

			// j가 9면 10번 타자인 조건이기 때문에 0으로 초기화해서 1번 타자부터 치게 만든다
			if (j >= 9) {
				j = 0;
			}

			// j를 여기서 초기화하지 않기 때문에 이전 타자번호의 +1 번호로 올라간다
			for (; j < 9; j++) {
				if (outCount == 3) {
					System.out.println("쓰리아웃! " + i + "회 말이 종료됩니다!");
					System.out.println("=====================");
					break;
				}

				System.out.println("=====================");
				System.out.println((j + 1) + "번 타자 " + Team.getPlayerList()[j]);

				int ballNum = 0;
				int strikeNum = 0;
				strike: while (true) {
					System.out.println("1. 공 보기");
					System.out.println("2. 휘두르기");
					System.out.print("선택 : ");
					int ball = rand.nextInt(2) + 1;
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						if (choice == ball) {
							ballNum++;
							System.out.println("볼 입니다! 볼카운트 " + ballNum + ":" + strikeNum);
							if (ballNum == 4) {
								System.out.println("볼넷입니다 주자 출루!");
								fourBall++;
								runPlayer = (hitPlayer + fourBall);
								while (runPlayer > 3) {
									myScore++;
									fourBall--;
									runPlayer--;
									System.out.println(Team.getTeamName() + " 밀어내기 득점합니다!");
									System.out.println("현재스코어 " + myScore + ":" + otherScore);
								}

								break strike;
							}
						} else {
							strikeNum++;
							System.out.println("스트라이크! 볼카운트 " + ballNum + ":" + strikeNum);
							if (strikeNum == 3) {
								outCount++;
								System.out.println("루킹삼진! " + outCount + " 아웃 입니다!");
								break strike;
							}
						}
						break;
					case 2:
						int swing = rand.nextInt(4) + 1;
						if (swing == 1) {
							hitPlayer++;
							System.out.println("때렸습니다 안타입니다!");
							runPlayer = (hitPlayer + fourBall);
							while (runPlayer > 3) {
								myScore++;
								hitPlayer--;
								runPlayer--;
								System.out.println(Team.getTeamName() + " 득점합니다!");
								System.out.println("현재스코어 " + myScore + ":" + otherScore);
								break strike;
							}
							break strike;
						} else if (swing == 2) {
							strikeNum++;
							System.out.println("헛스윙! 볼카운트 " + ballNum + ":" + strikeNum);
							if (strikeNum == 3) {
								outCount++;
								System.out.println("헛스윙 삼진! " + outCount + " 아웃 입니다!");
								break strike;
							}
						} else if (swing == 3) {
							if (runPlayer > 2 && outCount < 2) {
								runPlayer--;
								outCount++;
								myScore++;
								System.out.println("공 떴습니다! 주자 태그업! " + Team.getTeamName() + " 득점합니다!");
								System.out.println(Team.getTeamName() + "이 아웃카운트 하나와 점수를 맞바꿉니다!");
								System.out.println("현재스코어 " + myScore + ":" + otherScore);
								System.out.println(outCount + " 아웃 입니다!");
								break strike;
							} else {
								outCount++;
								System.out.println("공 떴습니다! 중견수가 잡아냅니다 " + outCount + " 아웃!");
								break strike;
							}
						} else if (swing == 4) {
							outCount++;
							System.out.println("빗맞았습니다! 유격수 앞 땅볼 " + outCount + " 아웃!");
							break strike;
						}
						if (ballNum == 4 || strikeNum == 3) {
							break;
						}
					}
				}
			}
		}
		if (myScore < otherScore) {
			System.out.println("경기 종료됐습니다! 최종스코어 " + myScore + ":" + otherScore);
			System.out.println("카카오 드림즈의 승리입니다!");
		} else if (myScore > otherScore) {
			System.out.println("경기 종료됐습니다! 최종스코어 " + myScore + ":" + otherScore);
			System.out.println(Team.getTeamName() + "의 승리입니다!");
		} else {
			System.out.println("경기 종료됐습니다! 최종스코어 " + myScore + ":" + otherScore);
			System.out.println("무승부입니다!");
		}
		return null;
	}
}
