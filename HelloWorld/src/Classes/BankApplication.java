package Classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount(scanner);
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount(Scanner scn) {
		System.out.println("계좌번호 입력:");
		String ano = scn.nextLine();
		System.out.println("사용자 입력:");
		String owner = scn.nextLine();
		System.out.println("금액입력:");
		int balance = scn.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
		System.out.println("계좌생성완료");
	}

	private static void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt);
			}
		}
	}

	private static void deposit() {
		System.out.println("조회할 계좌 입력:");
		String ano = scanner.nextLine();
		System.out.println("입금할 금액 입력:");
		int amount = scanner.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalance(balance + amount);
		
		if (accountArray != null) {
			
		}
		System.out.println("예금이 되었습니다." + " 계좌번호: " + ano + " 금액: " + (balance + amount));
		
	}

	private static void withdraw() {
	}

	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) {
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}

		return accnt;
	}
}
