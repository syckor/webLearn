package c_control;

import java.util.*;

public class Ex01_if_id {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");
		String birth = input.next();
		String id = input.next();
		
		char sung = id.charAt(0); //charAt 문자 하나를 얻어오는 문법
		
		// 1이거나 3이거나 9이면 남자
		// 2이거나 4이거나 0이면 여자
		
		if (sung == '1'| sung == '3' | sung == '9') {     //sung은 문자이므로 ''로 비교해줄 것. //if(true or false만 올수 있음 (boolean형만))
			System.out.println("남자"); 
		} else if( sung == '2'| sung == '4' | sung == '0') {
			System.out.println("여자");
		}
		
		
		//---------------------
		String age=birth.substring(0, 2); // birth.substring(startIndex, endIndex); Start번째부터 end번째 앞까지
        //    age = "88" <--문자열
		//    "88"문자열을 정수로 변환해야함
		int age2 = Integer.parseInt(age);
		      //age2 = 88 <--숫자
		
		
		// 올해 연도구하기 
		Calendar c = Calendar.getInstance(); //Import Calendar class
		int year = c.get(Calendar.YEAR);     //연도는 int형 
		
	    int old = 0;
	    
	    if (sung == '1' | sung == '2') {
	    	old = year - (1900 + age2) +1;
	    } else if ( sung == '3' | sung == '4') {
	    	old = year - (2000 + age2) + 1;
	    } else if ( sung == '0' | sung == '9') {
	    	old = year - (1800 + age2) + 1;
	    }
	   
	    System.out.println(old);
	}

}
