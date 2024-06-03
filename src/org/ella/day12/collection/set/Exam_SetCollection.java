package org.ella.day12.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.ella.day12.collection.student.Student;

public class Exam_SetCollection {
	
	public static void main(String[] args) {
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("이세훈", 90, 80));
		stdSet.add(new Student("허태성", 88, 44));
		stdSet.add(new Student("남궁성", 78, 67));
		stdSet.add(new Student("이세훈", 90, 80));
	
		System.out.println("크기 : " + stdSet.size());
		
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	
	public void setSample() {
		// Collection의 List, Set, Map -> 저장소
		// 자료구조의 특성에 따라서 선택하여 사용함
		// Set은 순서는 중요하지 않음, 중복을 허용하지 않음
		// -> 중복을 제거할 수 있음
		Set<String> strSet = new HashSet<String>();
		strSet.add("체리");
		strSet.add("딸기");
		strSet.add("사과");
		strSet.add("수박");
		strSet.add("포도");
		strSet.add("딸기");
		
		System.out.println("크기 : " + strSet.size()); // 크기 : 5 중복 허용 안함
		// 중복 허용하지 않는 것 -> 복권 당첨번호, 주민등록번호, 변수이름
		// 수학의 집합 : 순서가 중요하지 않음, 중복을 허용하지 않음
		// 중복이 있는 데이터들을 set에 넣으면 중복이 제거됨
		// 중복 없앨 때 주로 사용
		// 순서가 있는 경우에는 index 활용하지만 set은 순서가 없어서 지시자를 활용
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}		
	}
}
