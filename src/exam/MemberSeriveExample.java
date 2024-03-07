package exam;

public class MemberSeriveExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("심지언","12345");
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
