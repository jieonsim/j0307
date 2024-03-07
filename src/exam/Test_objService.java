package exam;

public class Test_objService {

	public String adultCheck(int age) {
		String temp = "";
		if (age >= 20) {
			temp = "성인";
		} else {
			temp = "미성년자";
		}
		return temp;
	}

	public void memberPrint(Test_objVO[] data, int cnt) {
		System.out.println("===================================================");
		System.out.println("아이디\t비밀번호\t성함\t나이\t성인여부");
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < cnt; i++) {
			System.out.println(data[i].getMid() + "\t" + data[i].getPwd() + "\t" + data[i].getName() + "\t" + data[i].getAge() + "\t" + data[i].getAdult() + "\t");
		}
		System.out.println("===================================================");
		System.out.println("\t\t전체 건수 : " + cnt);
	}
}
