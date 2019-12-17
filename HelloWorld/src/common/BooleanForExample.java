package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 98;
		
		// 60점 pass 아니면 fail
		// 90점 넘으면 양호, 70점 넘으면 보통, 아니면 미흡
		// 중괄호 없으면 한 줄만 나옴
		if (var1 > 90) {
			if (var1 > 95)
			System.out.println("A+");
			else
				System.out.println("A");
		} else if (var1 > 80) {
				System.out.println("B");
     	} else if (var1 > 70) {
			System.out.println("C");
     	} else if (var1 > 60) {
			System.out.println("D");
     	} else {
			System.out.println("F");
	}
	}
}
