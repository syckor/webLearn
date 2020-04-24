package c_control;

import java.util.Scanner;

public class Ex04_forPractice {

	public static void main(String[] args) {
////      (1)		
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		int num = input.nextInt();
//
//		for (int i = 1; i <=num; i++) {
//
//			// 나의 식  - > 반복문 안에 있으므로 println을 중간이 끼워넣어도 소용 없음
////			if (i >=1 & i<=5) {
////			System.out.print(i + " ");	
////			}else if ( i >= 6 & i <= 10) {				
////				System.out.print(i + " ");
////			}else if ( i >= 11 & i <= 15) {
////				System.out.print(i + " ");
////			}
//
//			System.out.print(i + " "); // " \t"를 넣으면 한탭씩 띄어씀
//			if ( i%5==0) {			   // 숫자 5개가 찍히면 줄바뀜   
//				System.out.println();
//			}
//			
//		}

//		(2) 문자 N을 입력받앙 N까지 출력하기                                                             
		                              
//		Scanner input = new Scanner(System.in); // 1 .문자하나 입력받기
//		System.out.println("알파벳을 입력하세요"); 
//		String alp = input.next();    
//		char num = alp.charAt(0);

////		for (char i = 'A' ; i <= num; i++) {  //내가 만든식
////			if(num <= 'Z') {
////				System.out.print(i);
////			} else if ( num <= 'z') {
////				System.out.print(i);
////			} else {
////				System.out.println("error");
////			}

//        if (num >= 'a' && num <= 'z') {          // 2. 입력한문자가 소문자라면
//        	for ( char i = 'a' ; i <= num ; i++) {
//        	System.out.print(i);
//        	}
//		}else if (num >= 'A' && num <= 'Z') {     // 3. 입력한 문자가 대문자라면
//			for ( char j = 'A' ; j <= num ; j++) {
//    		System.out.print(j);
//			} 
//		}else {                                     //4. 그 외라면
//			System.out.println("Error");
//		}

//              (3) 입력받은 문장열을 뒤집어서 출력
		Scanner input = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String spell = input.nextLine();
		
		int ea = spell.length(); //문자열의 길이변수 입력
		
		for (int i = ea-1; i >= 0 ; i--) {
		   char ch = spell.charAt(i); // ea는 
		   System.out.print(ch);
		}
		
	  
	}

}
