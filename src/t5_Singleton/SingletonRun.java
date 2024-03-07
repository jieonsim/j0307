package t5_Singleton;

public class SingletonRun {
	public static void main(String[] args) {
		// new Singleton(); -> 불가
		
		Singleton.getInstance();
	}
}
