package t2_static;

public class T2_staticBlock {
	int field1;
	static int field2;

	void method1() {}
	static void method2() {}
	
	// 정적 블록
	static {
		field2 = 200;
		method2();
		
		// field1 = 100; => 불가. static 필드만 올 수 있음
		// method1();
	}
}
