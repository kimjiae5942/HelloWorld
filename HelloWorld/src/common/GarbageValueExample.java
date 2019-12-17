package common;

public class GarbageValueExample {
	public static void main(String[] args) {
		int var1 = 125;
		byte var2 = 125;
		
		for (int i = 10; i > 0; i--) { //10번 반복하라는 의미.
			var1 = var1 + i; // var1 125 + 0;
			var2 = (byte) (var2 + 1); //int -> byte 형변환(casting)
			System.out.println("var1 : " + var1 + ", " + "var2 : " + var2);
		}
	}

}
