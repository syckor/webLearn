package c_control;

public class Ex04_for {

	public static void main(String[] args) {
//        for문
//		

//		1. for (초기치;조건식;증가값)
//			반복구문
		
//		2.
//		 초기치
//		for (  ; 조건식 ; 증가치) {
//		 반복구문
		
//		3.
//		for (  ; 조건식 ; ) {
//			반복구문
//			증가치
//		}
		
//		4.
//		초기치
//		for ( ; ; ) {
//			if (조건문 -1) break;
//			반복구문
//			증가치
//		}
		
		
		// 0. 인사말 5번 출력하기
//		for (int i = 0; i<5 ; i++) {  // ( 초기값 ; 조건식 ; 증가값)
//			System.out.println("안녕하세요");
//		}
        
		
		
		// 1. 1~10까지의 합구하기
		
		int sum = 0;
		for (int i = 1 ; i <= 100; i++) {
			sum += i;
			// sum = 1, i = 1  1까지의 합
			// sum = 3, i = 2  2까지의 합
			// sum = 6, i = 3   3 까지의 합
			// sum = 10, i = 4 4까지의 합
			// sum = 15, i = 5 5까지의 합
		}
		System.out.println("합 =" + sum);

		//2. 1~100까지에서 홀수의 합과 짝수끼리의 합 구하기

		
//		int odd = 0, even = 0;
//		나의 식
//		
//      for (int i = 1 ; i <= 100; i = i +2) {
//		    odd += i;
//		}
//	    for (int i = 0 ; i <= 100; i = i +2) {
//		    even += i;
//      }
//		
//		// 강사님 식
//		for (int i = 1 ; i <= 100; i++) {
//			if (i%2 == 1) {
//				odd += i;				
//			}else {
//				even += i;
//			}

			
			// 숫자 i가 홀수라면 odd에 합 구하기
			// 그렇지 않으면 even 구하기
			//odd += i;
		
//		System.out.println("홀수의 합 =" + odd);
//		System.out.println("짝수의 합 =" + even);


		
		// 3. A~Z 출력
		
		for(char ch = 'A' ; ch <= 'Z' ; ch++ ) {
			System.out.print(ch);
		}
		System.out.println();	
		// 4. A~Z 출력 ( 2개씩 건너뛰기)
		for(char ch = 'A' ; ch <= 'Z' ; ch += 2 ) {
			System.out.print(ch);
		}	
        System.out.println();
		
		// 5. Z~A출력
        for(char ch = 'Z' ; ch >= 'A' ; ch-- ) {
			System.out.print(ch);
		}
		
	}

}
