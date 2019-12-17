package common;

public class booleanExample {
     public static void main(String[] args) {
		boolean trueOrFalse = true;//true
		int var1 = 10;
		trueOrFalse = var1 > 15;
		
		for(int i =0; i < 10; i++) {
			var1++;
			trueOrFalse = var1 > 15;
		if(trueOrFalse)
			System.out.println(var1 + "=>참일 경우에");
		else
			System.out.println(var1 + "=>거짓일 경우에");
		}
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
