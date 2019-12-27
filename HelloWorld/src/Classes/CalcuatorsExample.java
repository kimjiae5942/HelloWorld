package Classes;

class Calculators {
	static double PI = 3.14159; //정적변수 대문자, 두 단어 이상이면 _ 로 구분
// 	ex) EARTH_AREA = 659326265;
	String color;
	
	void setColor(String color) {
		this.color = color;
	}
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
}

public class CalcuatorsExample {
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		cal.color = "White";
		cal.setColor("black"); // 인스턴스메소드 반드시 인스턴스 선언 후 사용
		
		cal.plus(4, 5);
		
		Calculators.plus(6, 7); //정적(static) 메소드는 클래스명.메소드
	}

}
