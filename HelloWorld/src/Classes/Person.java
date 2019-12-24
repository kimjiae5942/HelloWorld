package Classes;

public class Person {
	String personName;
	String job;
	int Age;

	Person() {

	}

	Person(String PersonName, String Birthday) {
		this.personName = PersonName;
		this.job = job;
	}

	void sleep() {
		System.out.println("잠을잔다.");
	}

	void eat() {
		System.out.println("먹는다.");
	}

	void introduce() {
		System.out.println("이름은 " + personName + " . 직업은 " + job + " 나이는 " + Age + " 살 입니다.");
	}

}
