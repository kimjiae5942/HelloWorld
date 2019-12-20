package referencetype;

public class ArrayExample {
public static void main(String[] args) {
	
	int[] num = new int[25];
	int sum = 0;
	for (int i = 0; i < 25; i++) {
		sum = sum + num[i];
				
	}
	System.out.println("총합 : " + sum);
	
	
	for(int i = 0; i < 25; i++) {
		System.out.println(num[1] + " ");
		if(i % 5 == 4)
		System.out.println();
	}
	
	
	
	int[] intAry = { 1, 2, 3, 4, 5 }; // int intAry[] 이렇게 써도 가능
	System.out.println(intAry[2]);
//	intAry[2] = 30;
//	System.out.println(intAry[2]);
	
//	int sum = 0;
	for (int i = 0; i < 5 ; i++)
		sum = sum + intAry[i];
	System.out.println("합계: " + sum);
	
	String[] strAry = {"Hello", "nice", "good", "wonderful"};
	for(int i = 0; i < 4; i++)
		System.out.println(intAry[i]);
}
}
