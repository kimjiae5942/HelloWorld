package Classes;

import java.util.Scanner;

public class PersonExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] personAry = new Person[2];

		Person person = new Person();
		person.personName = "김지애";
		person.job = "Student";
		person.Age = 27;

		Person person1 = new Person();
		person1.personName = "이동혁";
		person1.job = "Student";
		person1.Age = 20;

//		Person[] personAry = new Person[2];
		personAry[0] = person;
		personAry[1] = person1;
		for (int i = 0; i < 2; i++) {
			personAry[i].introduce();
		}

		System.out.println(personAry);

//	확장 for
		for (Person p : personAry) {
			p.introduce();

		}
		System.out.println("--------------");

		System.out.println("이름을 입력하세요.");
		String personName = sc.nextLine();

		for (Person p : personAry) {
			if (personName.equals(p.personName))
				p.introduce();

		}

	}

}
