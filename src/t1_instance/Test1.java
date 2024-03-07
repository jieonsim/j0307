package t1_instance;

public class Test1 {
	// 인스턴스 필드
	// double pi = 3.141592;
	public double pi = Math.PI;
	
	// 인스턴스 메소드
	double circleArea(int r) {
		double result = r * r * pi;
		return result;
	}
}
