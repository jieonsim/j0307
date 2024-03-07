package exam;
// 스트링 포맷 연습
public class Test_Format {
	public static void main(String[] args) {
		int su = 1234000;
		System.out.printf("금액 : %,d\n" , su);
		System.out.printf("금액 : %,10d\n" , su);
		
		double su2 = 1234000.123;
		System.out.printf("금액 : %,15.2f\n" , su2);
		
		System.out.println(String.format("%,15d", su));
		
		String su3 = "1234000"; // 문자 형식의 숫자
		System.out.println(String.format("%,15d", Integer.parseInt(su3)));
		
		/*
		 	String.format : int형 값 쓸 때
		 	(String.format("%,15d", 변수명 혹은 값))
		 	(String.format("%,15d", Integer.parseInt(변수명 혹은 값))
		 	Integer.parseInt => wrap
		 	
		 	
		 */
		
	}
}
