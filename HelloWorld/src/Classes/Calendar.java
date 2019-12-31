package Classes;

public class Calendar {
	public static final Object MONTH = null;
	public static final Object DAY_OF_MONTH = null;
	public static final Object DAY_OF_WEEK = null;
	public static Object YEAR;

	public static void main(String[] args) {
        int month = 11;
        System.out.println("=======("+month+"월)=======");
//		System.out.println(getMaxDate(month));
//        System.out.println(getFirstDayofMonth(month));
        String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
        for (int i = 0; i < getMaxDate(month); i++) {
			System.out.println("%4d");
			if(i % 7 == 0)
				System.out.println();
		}
	}
	
	public static int getFirstDayofMonth(int month) {
		int result = 0;
		if(month==9) {
			result = 1;
		}else if(month==10) {
			result = 3;
		}else if(month==11) {
			result = 6;
		}else if(month==12) {
			result = 1;
			}
		return result;
		}
	

	public static int getMaxDate(int month) {
		int dayCnt = 0;
		if (month <= 7) {
			if (month % 2 == 1) {
				dayCnt = 31;
			} else if (month == 2) {
				dayCnt = 28;
			} else {
				dayCnt = 30;
			}
		} else {
			if (month % 2 == 0) {
				dayCnt = 31;
			} else {
				dayCnt =30;
			}
		}
		return 0;
	
	}

	static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public String get(Object yEAR2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getActualMaximum(Object dayOfMonth) {
		// TODO Auto-generated method stub
		return null;
	}

	public void set(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

		
	}

	
	
