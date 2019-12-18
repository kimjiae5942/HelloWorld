package operators;

public class BitreverseOperatorExample {
   public static void main(String[] args) {
	int v1 = 10;
	int v2 = ~v1; // -11
	int v3 = v2 + 1; // -10
	System.out.println(v1 + ", "+v2 +", "+v3);
}
   
   public static String toBinaryString(int val) {
	   String str = Integer.toBinaryString(val);
	   while (str.length() < 32)  {
		   str = "0" + str;
		   }
	return str;
	   }
}
