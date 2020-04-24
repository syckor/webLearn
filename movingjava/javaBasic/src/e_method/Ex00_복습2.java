package e_method;

import java.util.Scanner;

public class Ex00_복습2 {
	
	static int jumsu;
	
	public static void main(String[] args) {
		
		String result = func();
		// 여기서 합격 여부를 출력하려면?
		System.out.println("결과 :" + result);
		method();
	}

	/** 
	 * method1
	 *  	- 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static  String func() {
		Scanner in = new Scanner(System.in);
		jumsu = in.nextInt();		
		
		if( jumsu >= 80) return "합격";
		else return "불합격";
	}
	
	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 */
	static void method() {
//		if (jumsu <= 100 & jumsu >= 90) {
//			System.out.println('A');
//		} else if (jumsu < 90 & jumsu >= 80) {
//			System.out.println('B');
//		} else if (jumsu < 80 & jumsu >= 70) {
//			System.out.println('C');
//		} else if (jumsu < 70 & jumsu >= 60) {
//			System.out.println('D');
//		} else {
//			System.out.println('F');
//		}
		int grade = jumsu/10;
		switch(grade) {
		case 10 :
		case 9 : 
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		case 5 :
			System.out.println("E");
			break;
		default : 
			System.out.println("F");
		}
	}

}
