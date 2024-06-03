package org.ella.day12.collection.list;

public class IntList {

	int[] nums; // = new int[3]; 해도됨
	int size;

	public IntList() { // 객체랑 필드값 초기화, 원칙은 여기다가 하는게 맞다
		nums = new int[3];
		size = 0;
	}

	// 나혼자만 알고 있는거면 리턴타입 필요없음
	public void add(int num) { // 받아오는거기 때문에 매개변수 필요!
		// num = 5
		nums[size] = num;
		size++;
	}

	// 전체값을 가져올 때는 매개변수 필요없음
	// 1개의 값을 가져올 때는 그 위치가 필요하므로 매개변수 필요함.
	public int get(int index) {
//		return nums;		// 리턴타입 int [] <- 리턴값의 자료형
		return nums[index]; // 리턴타입 int <- 리턴값의 자료형
	}

	public int size() {
		return size;
	}

	public void clear() {
		// 1. for문 돌면서 초기화
		// 2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
}
