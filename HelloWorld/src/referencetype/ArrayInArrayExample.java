package referencetype;

public class ArrayInArrayExample {
public static void main(String[] args) {
	int[][] intAry = new int[5][5];
	
    int num = 1;
    for (int j = 0; j < 5; j++) {
    	for (int i = 0; i < 5; i++) {
    		intAry[j][i] = num++;
    	}
    }
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(intAry[i][j] + " ");
			}
			System.out.println();
		}
	for (int x = 0; x < 5; x++) {
		for (int y = 4; y > 0; y--) {
			System.out.print(intAry[y][x] + " ");
		}
		System.out.println("-------------");
	}
	
	}
}
