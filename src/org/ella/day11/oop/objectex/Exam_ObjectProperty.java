package org.ella.day11.oop.objectex;

class Member {
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public Member() {} // 기본생성자는 필수로 쓰고 필요할 때 생성자 추가해서 사용하기!
	// 오버로딩
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	@Override
	public String toString() { // 재정의 하는것!
		// Object를 이미 상속 받았으니까 extends안해도 오브젝트의 값 사용 가능
		// (의미있는 데이터로 만들기 위해서 오버라이딩함)
		return "이름 : " + name + ", 나이 : " + age + ", 이메일 : " + email 
				+ ", 전화번호 : " + phone + ", 주소 : " + address;			
	}
}

public class Exam_ObjectProperty {

	public static void print(Object obj) { // 모든 클래스의 부모가 될 수 있음 obj는 모든 클래스의 객체를 받을 수 있다!
//		System.out.println("클래스 이름 : " + obj.getClass().getName());
//		System.out.println("해시 코드값 : " + obj.hashCode());
//		// 의미있는 데이터로 만들어 출력하고 싶다면 오버라이딩 필수!
//		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
////		System.out.println("객체 출력 : " + obj); 	// toString() 생략 가능
//														// 객체를 출력하면 toString()의 결과로 출력됨
	}
	
	public static void main(String[] args) {
		print(new Member("일용자", 11, "eomji1233@gmail.com", "01053248588", "서울시 중구"));
		print(new Member());
		
		String javaStr = "Java";
		String javaStr2 = new String("Java");
		String javaStr3 = "Java";
		// 문제
		// if(javaStr == javaStr3) { -> ??? true, 주소가 같음
		// if(javaStr == javaStr2) { -> ??? false
		// if(javaStr3 == "Java") { -> ??? true
		// if(javaStr == "javA") { -> ??? false
		
		
		System.out.println("javaStr : " + javaStr + ", javaStr2 : " + javaStr);
//		if(javaStr2 == "Java") { // new 키워드로 넣었기 때문에 주소가 다르다!
//		if(javaStr.equals("Java")) {	// eqauls는 Object클래스의 메소드
		if("Java".equals(javaStr2)) { 	// 앞에 리터럴 써주면 nullpointException 방지할 수 있음!
			System.out.println("똑같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}
}
