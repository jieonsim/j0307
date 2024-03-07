package t2_static;

public class T3_finalRun2 {
	public static void main(String[] args) {		
		T3_final2 t3_2 = new T3_final2("1234-1234");
		System.out.println("t3_2.jumin : " + t3_2.jumin);
		System.out.println("1번 name : " + t3_2.name);
		
//		t3_2.jumin = "2222-2222"; => 위에 파이널로 이미 값을 줬기 때문에 변경 불가
		t3_2.name = "홍길동";
		
		System.out.println("2번 name : " + t3_2.name);
		
		t3_2.name = "홍길창";
		System.out.println("3번 name : " + t3_2.name);
	}
}
