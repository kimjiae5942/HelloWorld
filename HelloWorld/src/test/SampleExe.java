package test;

import java.util.Scanner;
//생성자 오버로딩
class Sample {
	int price;
	String item;
	int qty;

	Sample() {
	}

	Sample(int price) {
		this.price = price;
	}

	Sample(int price, String item) {
		this.price = price;
		this.item = item;
	}
}

public class SampleExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Sample[] samAry = new Sample[100];
		Sample sample = new Sample(30, "apple");
		
		
		System.out.println("메뉴선택");
		
		int menu = scn.nextInt();
		scn.nextLine();
		System.out.println("다음선택1");
		scn.nextLine();
		System.out.println("다음선택2");
		scn.nextLine();

		if (1 == 1 && 2 == 1) {
			System.out.println("오류!!");
		} else {
			int result = 3 + 5;
		}

		cal("item", 3, 1000);

	}

	static int cal(String a, int b, int c) {
		return 10;
	}
}
