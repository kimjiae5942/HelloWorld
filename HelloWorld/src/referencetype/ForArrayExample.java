package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {
//	1~10 합  ?
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);

//	for를 while 구문으로
		int sum1 = 0;

		int i = 1;
		while (i <= 10) {
			sum1 += i;
			i++;
		}
		System.out.println("1부터 10까지의 합: " + sum1);
//	1~100의 수 중에서 3의 배수 합(for문)
		int sum3 = 0;
		for (int j = 1; j < 100; j++) {
			if (j % 3 == 0) {
				sum3 += j;
			}
		}
		System.out.println("3의 배수의 합: " + sum3);
		
//		1~100 7의 배수 출력
		

//	Math.random 0~6 실수의 합이 5가 되면
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
	
		
		}
	}
}
