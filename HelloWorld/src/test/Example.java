package test;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("점수입력: ");
			int num = scanner.nextInt();
			scanner.nextLine();
			
			
			if ( num<0 || num>=100) {
				System.out.println("입력오류!!");
			} else {
				System.out.println("입력된값: " + num);
			}
		}
	}
