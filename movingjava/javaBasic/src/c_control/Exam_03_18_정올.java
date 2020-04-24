package c_control;

import java.util.Scanner;

public class Exam_03_18_정올 {

	public static void main(String[] args) {
		
		//주사위 두 수의 합 구하기
		
		Scanner input = new Scanner(System.in);
		System.out.println("2에서 12사이의 숫자입력");
		int num = input.nextInt();

		if(num<=2 || num >=12) {
			System.out.println("Error");
		} 
		else {
			for ( int a = 1; a <= 6 ; a++) {
				for (int b = 1 ; b <=6 ; b++) {
					if (a + b == num) {
						System.out.printf("<%d, %d>" , a, b);
					    System.out.println();
				    }
			    }
		    }
	    }

	}

}
