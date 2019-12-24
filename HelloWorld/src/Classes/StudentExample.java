package Classes;

public class StudentExample {
	private static char[] introduce;

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");
//	                             ▽ 변수 명
		Student student = new Student();
		student.studentNo = "191234-1234";
		student.studentName = "김지애";
		student.age = 20;
		student.major = "English";
		student.introduce();
		
		Student student1 = new Student("Yedam", "191111-1111", "이동혁");
		//		student1.introduce();
//		student1.newMethod();
//		System.out.println(student.major);
//		student.doHomework();
//		System.out.println(student);
		System.out.println(introduce);
	}
}
