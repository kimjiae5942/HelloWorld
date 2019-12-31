package Classes;

import java.util.Scanner;

public class FriendExe {
	private static Friend[] friendArray = new Friend[10];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");

			selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				friendInput(scanner);
			} else if (selectNo == 2) {
				friendCheck();
			} else if (selectNo == 3) {
				friendList();
			} else if (selectNo == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	static void friendInput(Scanner scn) {
		int selectNo = 0;
		Friend friend = null;

		System.out.println("---------------------------");
		System.out.println("1.대학동창 | 2.회사동료 | 3.그 외 ");
		System.out.println("---------------------------");
		System.out.println("선택> ");

		selectNo = scanner.nextInt();
		scanner.nextLine();

		if (selectNo == 1) {
			System.out.println("이름을 입력하세요.");
			String name = scn.nextLine();
			System.out.println("연락처를 입력하세요.");
			String phone = scn.nextLine();
			System.out.println("학교를 입력하세요.");
			String univ = scn.nextLine();
			System.out.println("전공을 입력하세요.");
			String major = scn.nextLine();

			friend = new UnivFriend(name, phone, univ, major);

		} else if (selectNo == 2) {
			System.out.println("이름을 입력하세요.");
			String name = scn.nextLine();
			System.out.println("연락처를 입력하세요.");
			String phone = scn.nextLine();
			System.out.println("회사명을 입력하세요.");
			String company = scn.nextLine();
			System.out.println("부서명을 입력하세요.");
			String dept = scn.nextLine();

			friend = new ComFriend(name, phone, company, dept);

		} else if (selectNo == 3) {
			System.out.println("이름을 입력하세요.");
			String name = scn.nextLine();
			System.out.println("연락처를 입력하세요.");
			String phone = scn.nextLine();

			friend = new Friend(name, phone);
		}
		for (int i = 0; i < friendArray.length; i++) {
			if (friendArray[i] == null) {
				friendArray[i] = friend;
			}
		}
	}

	static void friendCheck() {
		System.out.println("조회할 이름을 입력하세요.");
		String name = scanner.nextLine();
		
		System.out.println();
	}

	static void friendList() {
		
	}
}

//1번 입력하면 1.대학동창 2.회사동료 3.그외 |
