package extendpkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

		@Override
		public boolean roll() {
			++accumulateRotation;
			if (accumulateRotation < maxRotation) {
				System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulateRotation));
				return false;
			} else {
				System.out.println("*** " + location + "HankookTire 펑크 ***");
			}
			return false;
		
		}
		}

