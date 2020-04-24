package d_array;

import java.util.Calendar;

public class Ex03_day {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		System.out.println( y + "년" + (m + 1) + "월" + d + "일") ;

		//시,분,초 출력
	    int h = cal.get(Calendar.HOUR_OF_DAY);
	    int mi = cal.get(Calendar.MINUTE);
	    int s = cal.get(Calendar.SECOND);
	    System.out.println(h + "시" + mi +"분" + s +"초");
	    
	    // 요일  일요일(1)~토요일(7)
	    
	    String [] day = {"일", "월", "화", "수", "목", "금", "토"};
	    System.out.println( day[cal.get(Calendar.DAY_OF_WEEK)-1]  + "요일");
		
	}

}
