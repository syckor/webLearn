package c_control;

import java.util.Scanner;

public class Exam_03_16_1 {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print(" a = ");
//		a = input.nextInt();
//		
//		System.out.print(" b = ");
//		b = input.nextInt();
//		
//		System.out.print(" c = ");
//		c = input.nextInt();
		
		Scanner input = new Scanner(System.in);
		System.out.print("세 정수를 입력하세요 : "); // space로 a b c 구분
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
//		
//		if (a >= b & b>= c) {
//			System.out.println(b);
//		} else if (c >= b & b >= a) {
//		    System.out.println(b);
		
//		} else if (c >= a & a >= b) {
//			System.out.println(a);
//		} else if (b >= a & a >= c) {
//			System.out.println(a);
		
//		} else if (a >= c & c >= b) {
//			System.out.println(c);
//		} else if (b >= c & c >= a) {
//			System.out.println(c);
//		}
		
		if (a >= b & b > c | c > b & b > a) {
			System.out.println(b);
		} else if (c >= a & a >= b | b >= a & a >= c) {
			System.out.println(a);
		} else if (a >= c & c >= b | b >= c & c >= a) {
			System.out.println(c);
		}
		
		 

	}

}
