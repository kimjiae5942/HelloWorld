package extendpkg;

public class Tire {
	int maxRotation;
	int accumulateRotation;
	String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulateRotation));
			return false;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
		}
		return false;
	}

}
