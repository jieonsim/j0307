package t1_instance;

public class TestRun {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("pi : " + t1.pi);
		
		double area = t1.circleArea(10);
		System.out.println("반지름 10인 원 넓이 : " + area);
	}
}
