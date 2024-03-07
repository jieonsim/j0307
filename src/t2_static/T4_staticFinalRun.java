package t2_static;

public class T4_staticFinalRun {
	public static void main(String[] args) {
		T4_staticFinal t4 = new T4_staticFinal("1234-1234");
		
		// System.out.println("국가명 : " + t4.NATION); // 이 방법은 지양
		System.out.println("국가명 : " + T4_staticFinal.NATION);
		System.out.println("주민등록번호 : " + t4.jumin);
		System.out.println("이름 : " + t4.name);
		System.out.println("국가명 (메소드 호출) : " + t4.getNation());
		System.out.println();
	}
}
