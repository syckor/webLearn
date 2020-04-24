package b_operator;

import java.util.Scanner;

/*
 *  연산자와 대입연산자를 합치기
 *  	- 산술, 이진논리, 쉬프트
 *      - += -= *= /+ %=
 *      - &= |= ^=
 *      - <<= >>= >>>=
 */
public class Ex10_Assignment {

	public static void main(String[] args) {
		
		
//		int c = 0;
//		int d = 0;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("a = ");
//		c = input.nextInt();
//		System.out.println("b =" );
//		d = input.nextInt();
//		
//		c+= d; 
//		System.out.println("+= 결과 : " + c );  
//		c-= d; 
//		System.out.println("-= 결과 : " + c );
//		c*= d; 
//		System.out.println("*= 결과 : " + c );
//		c/= d;
//		System.out.println("/= 결과 : " + c ); 
//		c%= d; 
//		System.out.println("%= 결과 : " + c );
		
		int  a = 10;
		int  b = 7;

		a+= b; // a = a + b;
		System.out.println("+= 결과 : " + a );  //17
		a-= b; // a = a - b;
		System.out.println("-= 결과 : " + a );// 10
		a*= b; // a = a * b;
		System.out.println("*= 결과 : " + a );//70
		a/= b;// a = a / b;
		System.out.println("/= 결과 : " + a ); //10
		a%= b; // a = a % b;
		System.out.println("%= 결과 : " + a ); //3
	
	}
}
