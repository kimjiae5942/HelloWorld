package referencetype;

public class MethodExample {
private static char[] result;

public static void main(String[] args) {
//	printStar();
//	int s1 = sum(3,5);
	double s1 = divideBy(5,3);
	System.out.println("s1 은 " + s1);
	
	String result = printResult("김지애");
	System.out.println(result);
	
	double s2 = calculator(3, 4, "+");
	System.out.println("s2는 " );
}

public static double calculator(double a, double b, String cal) {
	double result = 1;
	return result;
}


public static String printResult(String name) {
	return "반갑습니다 " + name + " 씨.";
}

public static double divideBy(double a, double b) {
	double result = 0;
	result = a / b;
	return result;
	
}
//method 이름 (double) divideBy(int, int)


}
