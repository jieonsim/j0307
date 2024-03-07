package t4_Getter_Setter;

import java.util.*;

/*
	1. 이름, 나이, 주소, 성별을 입력 받아 저장 출력
	2. 나이 : 15세 이상 70세 미만인 사람만 가입 가능
	3. 주소 : 외국인은 0으로 입력된다
	4. 성별 : 남자 - 1,3 / 여자 : 2, 4로 입력 처리 후 '남자'/'여자'로 저장한다
	
*/

public class Test2Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test2VO vo = new Test2VO();

		System.out.print("성함을 입력하세요 : ");
		vo.setName(scanner.next());

		System.out.print("나이를 입력하세요 : ");
		vo.setAge(scanner.nextInt());

		System.out.print("주소를 입력하세요(외국인은 0을 입력하세요) : ");
		vo.setAddress(scanner.next());

		Test2Service service = new Test2Service();

		System.out.print("성별을 입력하세요(남자 : 1 or 3 / 여자 : 2 or 4) : ");
		int sex = scanner.nextInt();

		vo.setStrGender(service.setGenderCheck(sex));

		System.out.println("→ 등록된 신상 정보입니다.");
		System.out.println("이름 : " + vo.getName());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println("성별 : " + vo.getStrGender());
		
		scanner.close();
	}
}
