package t2_static;

public class T1Run {
	public static void main(String[] args) {
		// T1 t1 = new T1();
		
		// System.out.println("pi : " + t1.pi);
		
		// double area = t1.circleArea(10);
		// System.out.println("반지름 10인 원 넓이 : " + area);
		
		// 스태틱 필드, 메소드를 이용
		// 클래스 이름.필드 or 클래스 이름.메소드
		double area2 = T1.circleArea(20);
		System.out.println("반지름 20인 원 넓이 : " + area2);

	}
}
