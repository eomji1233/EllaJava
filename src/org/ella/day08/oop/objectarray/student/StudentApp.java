package org.ella.day08.oop.objectarray.student;

public class StudentApp {

	public static void main(String[] args) {
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
//		Student students = new Student(); // 피료업음
		end: while (true) {
			int choice = view.StudentMenu();
			Student [] students = null;
			switch (choice) {
			case 1:
				// manage.inputInfo();
				students = view.displayInput();
				mng.inputInfo(students);
				break;
			case 2:
				// manage.printInfo();
				students = mng.printInfo();
				view.displayInfo(students);
				break;
			case 3:
				view.displayMsg("메뉴를 종료합니다.");
				break end;
			default:
				view.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
}
