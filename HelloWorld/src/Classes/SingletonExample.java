package Classes;
class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton () {
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
// getInstance 쓰면 같은 것을 참조함
		
		if (singleton == singleton2) {
			System.out.println("동일한 객체.");
		} else {
			System.out.println("다른 객체.");
		}
	}
}
