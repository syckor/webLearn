package c_control;

import java.util.Scanner;

public class Ex03_switch_성적 {

	
	public static void main(String[] args) {
		
		//국,영,수 점수 입력받아서 총점, 평균 출력
		// 1. 평균에 따라서 학점( A~F ) 출력 
		// switch문 활용하기
        int kor=0, eng=0, math=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("국어점수 ->");
		kor = input.nextInt();
		
		System.out.print("영어점수 ->");
		eng = input.nextInt();
		
		System.out.print("수학점수 ->");
		math = input.nextInt();
		
		int total = kor + eng + math;
		System.out.println("총점  " + total);
		

		double avg = (double)total/3; 
		System.out.println("평균  " + avg);
		
		int ans = 0;
		ans = total/30;
		char grade;
		
		switch(ans) {
		case 10 : // grade = 'A'; break; --> 10도 'A'학점 이므로 case9에서 수행할 것이기 때문에 생략 가능함
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		case 5 : grade = 'E'; break;
		default : grade = 'F'; break;
		}
		System.out.println(grade);
		

	}
	
}
