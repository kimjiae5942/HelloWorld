package Classes;

public class FriendExample {
	public static void main(String[] args) {
		Friend[] fArray = new Friend[5];
		UnivFriend[] uArray = new UnivFriend[5];
		ComFriend[] cArray = new ComFriend[5];
		
		UnivFriend uf = new UnivFriend("name1","1111","Yedam","java");
		ComFriend cf = new ComFriend("name2","2222","YDCompany","Develop");
		Friend f = new Friend("name3","3333");
		Friend f1 = uf;
		Friend f2 = cf;
		
		uf.getName(); //Friend class
	    uf.getPhone(); //Friend class
	    uf.getUniv(); //Univ
	    uf.getMajor(); //Univ
	    
	    f1.getName(); //Friend
	    f1.getPhone(); //Friend
	    
	    fArray[0] = uf;
	    fArray[1] = cf;
	    fArray[2] = f;
	    
	    for(int i = 0; i < 3; i++) {
	    	fArray[i].introduce();
	    }

		}
}
