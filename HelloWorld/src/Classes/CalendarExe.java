package Classes;

public class CalendarExe {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 0, 1);

		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("마지막 일: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("오늘의 요일: " + cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2019, 0, 1);

		createCal(2020, 2);
	}

	public static void createCal(int year, int month) {

		Calendar cal = Calendar.getInstance();
		int months = month + 1;

		cal.set(year, month, 1);

		System.out.println("=======(" + month + "월)=======");
//			System.out.println(getMaxDate(month));
//	        System.out.println(getFirstDayofMonth(month));
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(" " + weeks[i]);

		}
	}
}
