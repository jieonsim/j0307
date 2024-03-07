package t2_static;

public class T3_final {
	final String nation = "korea";
	// 값을 고정시켜서 쓰겠다 = final
	String jumin;
	String name;
	
	public T3_final() {}
	
//	T3_final(String nation) {
//		this.nation = nation;		
//	} => fianl이라 불가
	
	T3_final(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
	
	
}
