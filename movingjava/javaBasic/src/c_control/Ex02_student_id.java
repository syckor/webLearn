package c_control;

import java.util.Scanner;

public class Ex02_student_id {
	
	public static void main(String[] args) {
			
	   //String id = "";
	   
	   Scanner input = new Scanner(System.in);
	   System.out.println("학번 10자리를 입력하세요");
	  
	   String id = input.next();
	   
//-----------------------------------------------------------------
	   
	   String year = id.substring(0,4);
	   
	   //char c = id.charAt(4);
	   String college = "";
	   
	   String m = id.substring(5,7);  //m = "문자열"
	   String major = "";
//------------------------------------------------------------------	   

	   if (id.charAt(4) == '1') {
		  college = "공대";
//		  if (m.equals ("11")) {			 
//			  major = "컴퓨터학과";
//		  } else if ( m.equals ("12")) {
//		      major = "소프트웨어학과";
//		  } else if ( m.equals ("13")) {
//			  major = "모바일학과";
//		  } else if ( m.equals ("22")) {
//			  major = "자바학과";
//		  } else if ( m.equals ("33")) {
//			  major = "서버학과";
//		  }
		  switch(m) {
		     case "11" : major = "컴퓨터학과"; break;
		     case "12" : major = "소프트웨어학과"; break;
		     case "13" : major = "모바일학과"; break;
		     case "22" : major = "자바학과"; break;
		     case "33" : major = "서버학과"; break;
		  }
		  
	   } else if ( id.charAt(4) == '2') {
		   college = "사회대";
		   if ( m.equals ("11")) {
			   major = "사회학과";
		   }else if (m.equals ("12")) {
			   major = "경영학과";
		   }else if (m.equals ("13")) {
			   major = "경제학과";
		   }
	   }

//----------------------------------------------------------------------------------------	   
	   
	   System.out.println(year + "년도에 입학한 " + college + " " + major + "학생입니다");
	   
	   
		
		
		
	}
}
