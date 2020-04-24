package e_method;

import java.util.Scanner;

public class Ex00_복습3 {
	
	static int sum = 0;
	static double avg = 0; 
	
	public static void main(String[] args) {
		int score[] = input();
		calScore(score);
		output();
		

	}
	//국영수 점수 입력받기
	static int[] input() {
		
		int kor = 0, eng = 0, math = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수입력");
		kor = input.nextInt();
		eng = input.nextInt();
		math = input.nextInt();
		int score[] = {kor, eng, math};		
		return score;
	}
				
	
	//입력받은 국영수 점수의 총점, 평균 구하기
	static void calScore(int score[]) {
		
		for(int i = 0; i < score.length ; i++) {
			sum += + score[i];
		}
		avg = (double)sum/score.length;
		
	}
	
	static void output() {
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
