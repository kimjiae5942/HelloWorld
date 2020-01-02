package Classes;

public class ClassExample {
public static void main(String[] args) {
	Object obj = new Friend();
	System.out.println(obj.hashCode());
	
	if(obj instanceof Friend) {
	Friend frnd = (Friend) obj;
	System.out.println(frnd.getName() + frnd.getPhone());
	}
	
	
	
	Friend[] fArray = new Friend[10];
	fArray[0] = new UnivFriend("","","","");
	fArray[1] = new ComFriend("","","","");
	
	
	
}
}
