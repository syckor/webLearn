import java.util.Scanner;

public class Practice1 /* 윤년구하기 */ { 
	
	

	public static void main(String[] args) {

		
		Scanner leap = new Scanner(System.in);
		int year = 0;
		
		
		System.out.println("연도를 입력하세요");
        year = leap.nextInt();
        
//        if (year%400 == 0) {
//        	System.out.println("윤년");
//        } else if(year%100 == 0 ) {
//        	System.out.println("평년");
//        } else if(year%4 == 0) {
//        	System.out.println("윤년");
//        } else {
//        	System.out.println("평년");
//        }
//	}
         if (year%4 == 0 && year%100 !=0 || year%400 == 0) {
        	 System.out.println("윤년");
         } else {
        	 System.out.println("평년");
         }
         
	}
}
