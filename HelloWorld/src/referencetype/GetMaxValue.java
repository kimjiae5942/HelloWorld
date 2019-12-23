package referencetype;

public class GetMaxValue {
 public static void main(String[] args) {
	int[] intAry = { 8, 7, 6, 5, 4 };
	int temp = 0;
	
	for(int j = 0; j <(intAry.length - 1); j++)
		
	for (int i = 0; i <(intAry.length - 1); i++) {
		if (intAry[i] > intAry[i + 1]) {
			temp = intAry[i];
			intAry[i] = intAry[i + 1];
			intAry[i + 1] = temp;
		}
	}
	for (int i = 0; i < intAry.length; i++) {
		System.out.println(intAry[i] + " ");
	}
}
}
