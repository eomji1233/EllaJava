package org.ella.day08.oop.student.practice;

public class StudentApp {

	
	public static void main(String[] args) {
	ViewStudent view = new ViewStudent();
	ManageStudent student = new ManageStudent();
		
		end : 
		while(true) {
			int choice = view.printmenu(); // 선택한 값은 프린트메뉴에 입력된다
			switch(choice) {
			case 1 :
				student.inputScore();
				break;
			case 2 :
				student.printScore();
				break;
			case 3 :
				view.displayMsg("메뉴가 종료되었습니다.");
				break end;
			default :
				view.displayMsg("1 ~ 3 사이의 수를 입력하세요.");
			}
		}
	}
}
