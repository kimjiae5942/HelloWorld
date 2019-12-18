package operators;

public class OperatorExample {
   public static void main(String[] args) {
	int result = 0;
	int a = 10, b = 20;
//	result = a + b;
//	System.out.println("결과값은: " + result);
//	(ab 아니어도)타입만 맞으면 됨
	
	multi(30, 40); 
   }
   public static void sum(int a, int b) {
	   int result = a + b;
	   System.out.println("method 결과값은: " + result);
   }
   
   public static void multi(int a, int b) {
   int result = a * b;
   System.out.println("method 결과값은: " + result);
}
}