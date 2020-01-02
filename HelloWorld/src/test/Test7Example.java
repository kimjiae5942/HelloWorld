package test;

import java.util.Scanner;

public class Test7Example {
	private static Test7[] memberArray = new Test7[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.리스트 | 5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				memberInput(scanner);
			} else if (selectNo == 2) {
				memberUpdate();
			} else if (selectNo == 3) {
				memberDelete();
			} else if (selectNo == 4) {
				memberList();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void memberInput(Scanner scn) {
		System.out.println("ID: ");
		String id = scn.nextLine();
		System.out.println("이름: ");
		String name = scn.nextLine();
		System.out.println("연락처: ");
		String phone = scn.nextLine();
		Test7 member = new Test7(id, name, phone);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = member;
				break;
			}
		}
		System.out.println("*회원 추가 완료*");
	}

	private static void memberUpdate() {
		int selectNo = 0;
		Test7 member = null;

		System.out.println("---------------------");
		System.out.println("1.ID | 2.이름 | 3.연락처");
		System.out.println("---------------------");
		System.out.println("선택> ");

		selectNo = scanner.nextInt();
		scanner.nextLine();
		
		if (selectNo == 1) {
			System.out.println("변경할 이름: ");
		}
	}

	private static void memberDelete() {
		System.out.println();
	}

	private static void memberList() {
		for (Test7 member : memberArray) {
			if (member != null) {
				System.out.println(member);
			}
		}
		System.out.println();
	}
}
