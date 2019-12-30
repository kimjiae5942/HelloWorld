package Classes;

import java.util.Scanner;

public class FriendExe {
	static Friend[] friendArray = new Friend[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
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
		System.out.println();
	}

	static void friendCheck() {

	}

	static void friendList() {

	}
}
//1번 입력하면 1.대학동창 2.회사동료 3.그외 |
