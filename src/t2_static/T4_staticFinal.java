package t2_static;

public class T4_staticFinal {
	static final String NATION = "korea"; // static final 상수라 대문자
	final String jumin;
	String name;
	
	T4_staticFinal(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return NATION;
	}
}
