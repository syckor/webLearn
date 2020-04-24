package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
		
//		int a = 0, b = 0; //변수 선언
//		
//		Scanner input = new Scanner(System.in); // Scanner 선언;
//		
//		System.out.print(" a - > :" ); //입력받아 변수에 저장
//		a = input.nextInt();
//		
//		System.out.print(" b - > :" );
//		b = input.nextInt();
//		
//		int sum = a + b 
//		    , sub = a - b
//		    , multi = a*b
//		    , div = a/b
//		    , last = a%b; //계산하여 결과변수에 저장
//		System.out.println("더하기 : " +sum + " "+ 
//				           "빼기 : " + sub + " "+
//				           "곱 : " + multi +" "+
//				           "나누기 : " + div +" "+				           
//				           "나머지 : " + last ); //결과출력

		//나머지 연산자 활용 - 홀/ 짝수 구하기
		
		// (1) 정수형 변수 su 선언
		int su = 0;
		// (2) Scanner 선언
		Scanner input = new Scanner(System.in);
		// (3) 화면에 "정수를 입력하세요" 출력
		System.out.println("정수를 입력하세요" );
		// (4) 입력받은 정수를 su 변수에 저장
		su = input.nextInt();
		
		// (5) 입력받은 수가 홀/짝수 구하기
		
		if (su%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 입력받은 수가 3의 배수인지 아닌지 확안
		if (su%3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수가 아님");
		}
		
	}

}
