package t3_package;

import t2_method.*;


public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("1. 번호 : " + t1.getNo());
		System.out.println("1. 이름 : " + t1.getName());
		
		t1.setNo(10);
		t1.setName("홍길동");
		
		System.out.println("2. 번호 : " + t1.getNo());
		System.out.println("2. 이름 : " + t1.getName());
		
		System.out.println("t2_static.T1의 PI : " + t2_static.T1.pi);
		
		t1_instance.Test1 t2 = new t1_instance.Test1();
		System.out.println("t1_instance.Test1의 PI : " + t2.pi);
		
		new Calculator();
		new Test3_1();

	}
}
