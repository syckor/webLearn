package b_operator;

import java.util.Scanner;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		// a, b를 입력받아 두 수 중 큰 수를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt();
		
		int max = ( a > b)? a:b; // 조건이 true이면 a를 수행, false면 b를 수행하게 됨
        System.out.println(max + "가 큰 수 ");		
	}

}
