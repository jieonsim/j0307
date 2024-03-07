package t2_static;

public class T1 {
	// 인스턴스 필드
	// double pi = 3.141592;
	
	// 정적 필드 (메소드 영역에 올라감, 객체를 생성 안하고 클래스 이름으로 불러씀)
	public static double pi = Math.PI;
	
	// 정적 메소드 (객체 생성 안해도 됨)
	static double circleArea(int r) {
		double result = r * r * pi;
		return result;
	}
}
