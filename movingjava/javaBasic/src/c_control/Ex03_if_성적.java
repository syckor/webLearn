package c_control;

import java.util.Scanner;

public class Ex03_if_성적 {
	
	public static void main(String[] args) {
		
		//국,영,수 점수 입력받아서 총점, 평균 출력
		// 1. 평균에 따라서 학점( A~F ) 출력 
		// if문 활용하기
		
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
		
		char grade;
		
		if(avg >= 90.0) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else if (avg >= 50) {
			grade = 'E';			
		} else {
			grade = 'F';
		}

		System.out.println(grade + "학점");

	}

}
