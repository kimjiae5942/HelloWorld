package Classes;

public class MethodExample {
	public static void main(String[] args) {
		showName();
		showName("Jiae");
		showAge(27);
	}

	public static void showName() {
		System.out.println("Hello, I am charlie");
	}
	
	public static void showName(String name) {
		System.out.println("Hello, I am " + name);
	}
	
	public static void showAge(int age) {
		System.out.println("Hello, I am " + age + "year old.");
	}
}
