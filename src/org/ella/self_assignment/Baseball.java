package org.ella.self_assignment;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Baseball {
	static String teamName;
	static String sPitcher;
	static String[] playerList = new String[9];

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===== PLAY BASEBALL GAME! =====");
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 구단 등록");
			System.out.println("2. 선수 등록");
			System.out.println("3. 경기 시작");
			System.out.println("4. 선수 교체");
			System.out.println("5. 구단 해체");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("구단을 창설하세요!");
				System.out.print("창단일 : ");
				LocalDate now = LocalDate.now();
				System.out.println(now);
				System.out.print("감독 이름 : ");
				String userName = sc.next();
				sc.nextLine();
				System.out.print("구단명 : ");
				teamName = sc.nextLine();
				System.out.print("연고지 : ");
				String localName = sc.next();
				System.out.print("모기업 : ");
				String company = sc.next();
				break;
			case 2:
				System.out.println("투수를 정하세요!");
				System.out.print("투수 : ");
				sPitcher = sc.next();
				System.out.println("타순을 배치하세요!");
				for (int i = 0; i < playerList.length; i++) {
					System.out.print(i + 1 + "번2타자 : ");
					String playerName = sc.next();
					playerList[i] = playerName;
				}
				break;
			case 3:
				int myScore = 0;
				int otherScore = 0;
				System.out.println("===== 경기 시작 =====");
				int[] inning = new int[9];
				System.out.println(teamName + "와 카카오 드림즈의 경기를 시작합니다!");
				int playerOrder = 0;
				for (int i = 1; i < inning.length + 1; i++) {
					int outCount = 0;
					int hitPlayer = 0;
					int fourBall = 0;
					int runPlayer = 0;
					System.out.println("-" + i + "회 초" + "-");
					Random rand = new Random();
					int randSc = rand.nextInt(3);
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
					System.out.println("투수 " + sPitcher + " " + randSc + " 실점");
					System.out.println(teamName + " : " + myScore + " 드림즈 : " + otherScore);
					System.out.println("=====================");

					System.out.println("-" + i + "회 말" + "-");
					System.out.println("현재스코어 " + myScore + ":" + otherScore);
//					while (true) {
						for (int j = 0; j < 9; j++) {
							if (outCount == 3) {
								System.out.println("쓰리아웃! " + i + "회 말이 종료됩니다!");
								System.out.println("=====================");
								playerOrder = j;
								break;
							}
							if(playerOrder != 0) j = playerOrder;
							System.out.println("=====================");
							System.out.println((j + 1) + "번 타자 " + playerList[j]);
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
											System.out.println("볼넷 개수 : " + fourBall); // 확인용
											System.out.println("주자 " + runPlayer + "명"); // 확인용
//										if (fourBall > 3) {
//											System.out.println("밀어내기 득점합니다!");
//											myScore++;
//											fourBall--;
//											System.out.println("현재스코어" + myScore + ":" + otherScore);
//										}
											while (runPlayer > 3) {
												myScore++;
												fourBall--;
												runPlayer--;
												System.out.println(teamName + " 밀어내기 득점합니다!");
												System.out.println("현재스코어 " + myScore + ":" + otherScore);
												System.out.println("주자 " + runPlayer + "명"); // 확인용
//											break strike;
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
										System.out.println("주자 " + runPlayer + "명"); // 확인용
//									if (hitPlayer > 3) {
//										System.out.println(teamName + " 득점합니다!");
//										myScore++;
//										hitPlayer--;
//										System.out.println("현재스코어 " + myScore + ":" + otherScore);
//										System.out.println("주자 " + runPlayer + "명"); // 확인용
//										break strike;
//									}
										while (runPlayer > 3) {
											myScore++;
											hitPlayer--;
											runPlayer--;
											System.out.println(teamName + " 득점합니다!");
											System.out.println("현재스코어 " + myScore + ":" + otherScore);
											System.out.println("주자 " + runPlayer + "명"); // 확인용
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
											System.out.println("공 떴습니다! 주자 태그업! " + teamName + " 득점합니다!");
											System.out.println("현재스코어 " + myScore + ":" + otherScore);
											System.out.println("주자 " + runPlayer + "명"); // 확인용
										} else {
											outCount++;
											System.out.println("공 떴습니다! 중견수가 잡아냅니다 " + outCount + "아웃!");
											break strike;
										}
									} else if (swing == 4) {
										outCount++;
										System.out.println("빗맞았습니다! 유격수 앞 땅볼 " + outCount + "아웃!");
										break strike;
									}
									if (ballNum == 4 || strikeNum == 3) {
										break;
									}
								}
							}
						}
					}
//				}
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("1 ~ 5 사이의 숫자를 입력해!");
			}

		}
	}
}
