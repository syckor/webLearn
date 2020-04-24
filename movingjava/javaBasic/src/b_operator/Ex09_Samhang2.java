package b_operator;

import java.util.Scanner;

public class Ex09_Samhang2 {

	public static void main(String[] args) {
		// 학생 점수를 입력받아 80점 이상이면 "합격"출력하고 그렇지 않으면 "불합격"출력
		// 삼항연산자를 이용할것
		
		int Score;
		Scanner input = new Scanner(System.in);
		System.out.println("점수 :" );
		Score = input.nextInt();
		
//		String a = "합격";
//		String b = "불합격";
//      String pass = (Score > 80) ? a : b;    		
	    String pass = (Score > 80) ? "합격" : "불합격";
	    System.out.println("결과 : " + pass);
	    

	}

}
