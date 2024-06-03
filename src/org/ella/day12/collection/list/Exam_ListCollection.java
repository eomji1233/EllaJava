package org.ella.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {

	public static void main(String[] args) {
		// List 인터페이스 존재
		// List 인터페이스를 구현하여 만든 클래스가 존재
		// ArrayList 클래스라고 하면 이것을 사용한다,   원래 존재하는 컬렉션
		List<String> list = new ArrayList<String>(); // 업캐스팅
		// ArrayList를 써도 되지만 부모 타입의 변수 = 자식 객체로 사용
		list.add("김만규");
		list.add("김지혁");
		list.add("양희준");
		list.add("오정민");
		list.add("김태우");
		list.add("이용재");
		list.add("조홍빈");
		list.add("오준석");
		list.add(2, "조승효"); // 인덱스의 사이에 들어감!
		
		 System.out.println(list.get(0));
		 System.out.println(list.get(5));
		 System.out.println("크기 : " + list.size());
		 int listSize = list.size() - 1;
		 System.out.println("마지막 값 : " + list.get(listSize));
		 for(int i = 0; i < list.size(); i++) {
			 System.out.println(i + " : " + list.get(i));
		 }
		 list.remove(listSize);
		 list.remove(2);
		 list.clear();
		 for(String name : list) {
			 System.out.println(name);
		 }
		 System.out.println("isEmpty() : " + list.isEmpty() + ", size() : " + list.size());
	}
	
	public void genericSample() {
		// 제네릭을 쓰면 형 변환하지 않아도 됨
		// 꺽새 쓰면은 강제 형 변환 필요없음
		GenericList<String> strList = new GenericList<String>();
		strList.add("김정욱");
		strList.add("이현주");
		strList.add("강신욱");
		
		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		// 제네릭 없이 사용하면 형 변환해야 됨
		ObjectList obj = new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종강");
		
		String start = (String) obj.get(0);
		String project = (String) obj.get(1);
		String end = (String) obj.get(2);
		System.out.println(start);
		System.out.println(project);
		System.out.println(end);
	}

	public void objListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");

		// object 타입을 정수나 실수로 출력할 수 없으므로
		// 앞에 타입을 붙이는 강제 형 변환
		double start = (double) objList.get(0);
		int end = (int) objList.get(1);
		String msg = (String) objList.get(2);
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}

	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);
		nums.add(7);
		nums.add(1023);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size());
		nums.clear(); // 모두 삭제
		System.out.println("크기 : " + nums.size());
	}
}
