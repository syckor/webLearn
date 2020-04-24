package b_operator;

import java.util.Scanner;

public class Exam_3_16 {

	public static void main(String[] args) {
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
		
		// 1. 학생점수 변수 선언
		// 2. Scanner 선언
		// 3. 화면에 "점수 입력 -> " 문장출력
		// 4. 입력값을 변수에 저장
		// 5. 점수에 따라 "평균" 출력
		
		int score = 0;    
		
		Scanner input = new Scanner(System.in);
        
	    System.out.println("점수 :" );
		score = input.nextInt();
		// if( 80< score < 90) <-- 사용안됨
		if (score < 90 && score > 80  ) {
			System.out.println("평균");
		}   
		

	}

}
