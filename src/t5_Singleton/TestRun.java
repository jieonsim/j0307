package t5_Singleton;

public class TestRun {
	public static void main(String[] args) {
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		Singleton sbs = Singleton.getInstance();
		// mbc, kbs, sbs는 서로 같은 객체이다.
		
		if (mbc == kbs) {
			System.out.println("mbc와 kbs는 서로 같은 객체를 가리키고 있습니다.");
		} else {
			System.out.println("mbc와 kbs는 서로 다른 객체를 가리키고 있습니다.");
		}

		if (mbc == sbs) {
			System.out.println("mbc와 sbs는 서로 같은 객체를 가리키고 있습니다.");
		} else {
			System.out.println("mbc와 sbs는 서로 다른 객체를 가리키고 있습니다.");
		}
	}
}
