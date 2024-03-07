package t4_Getter_Setter;

public class Test1 {
	// private으로 외부 접근 불가. 접근을 하기 위해선 getter와 setter 생성 필요
	private String name = "홍길동";
	private int age;
	private boolean gender;
	private String address;
	
	private String sex;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 20) {
			this.age = age;
		} else { // else this.age = 0; < 할 필요가 없음, 어차피 성인만 가입 가능한 거라 20이 안넘으면 그냥 가입 불가 처리
			System.out.println("미성년자는 가입하실 수 있습니다.");
		}
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		if (gender) {
			return "남자";
		}
		else {
			return "여자";
		}
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
