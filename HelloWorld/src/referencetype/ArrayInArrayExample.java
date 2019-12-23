package referencetype;

public class ArrayInArrayExample {
public static void main(String[] args) {
	int[][] intAry = new int[5][4];
	
    int num = 1;
    for (int j = 0; j < 5; j++) {
    	for (int i = 0; i < 4; i++) {
    		intAry[j][i] = num++;
    	}
    }
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(intAry[j][i] + " ");
			}
			System.out.println();
		}
	}
}
