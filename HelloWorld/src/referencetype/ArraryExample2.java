package referencetype;

public class ArraryExample2 {
	public static void main(String[] args) {
		
		
		int[] num = new int[25];
		int sum = 0;
		double avg = 0;
		
		
		for (int i = 0; i < 25; i++) {
			num[i] = i+1; 
			sum = sum + num[i];
			avg = sum / num[i];

		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
