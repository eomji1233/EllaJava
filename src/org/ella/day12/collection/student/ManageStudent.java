package org.ella.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ManageStudent implements ManageInterface {

	private List<Student> sList;

	public ManageStudent() {
		sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		sList.add(student);

	}

	@Override
	public List<Student> searchOneByName(String name) {
		if (name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for (Student std : sList) {
				if (name.equals(std.getName())) {
					// 리턴값이 리스트인 이유? 중복값이 있을 수 있으니까 리스트 만들기
					// 얘네가 여기있으면 초기화하기 때문에 매번 새로운 리스트로 만들어짐
//					List<Student> searchList = new ArrayList<Student>();
					searchList.add(std);
				}
			}
			return searchList; // List<Student> searchList로
								// 새로 만들어서 리턴값이랑 일치!
		}
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
//		if(sList.isEmpty() ) {
//			return null; 
//		} // 이걸로 쓰면 널포인트 첫번째거로 써야해
		return sList;
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);
	}

	public Student updateStd(Student std) {
		for (Student mOrigin : sList) {
			if (mOrigin != null) {
				String name = mOrigin.getName();
				if (name.equals(std.getName())) {
					sList.add(std);
				}
			}
		}
		return std;
	}

	public Map<String, Object> searchModifyStudent(String name) {
		if (name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for (int i = 0; i < sList.size(); i++) { // 전체에서
				Student student = sList.get(i);
				if (name.equals(student.getName())) { // 이름이 같으면
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}

	public int searchIndexByName(String name) {
		if (name != null) {
			int count = 0;
			for (Student student : sList) { // sList에서
				if (name.equals(student.getName())) { // 이름이 같으면
					return count;
				}
				count++;
			}
		}
		return 0;
	}
}
