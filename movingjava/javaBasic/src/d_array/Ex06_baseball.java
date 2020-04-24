package d_array;

import java.util.*;

public class Ex06_baseball {

	public static void main(String[] args) {

		int[] baseball = new int[3];
		int[] answer = new int[3];

//		int strike = 0, ball = 0;               // strike와 ball의 개수를 세어줄 변수 선언

		// 1. 임의의 수를 3개 baseball에 저장
		// - 중복수 배제
//		do{ //나의 식
//		 	for (int j = 0; j < baseball.length ; j++) {           // baseball배열의 개수보다 작을때까지 반복해서
//		 		baseball[j] = (int)(Math.random()*10);   // 0 < Math.random < 1  //임의의 숫자 출력
//	 		System.out.print(baseball[j]);
//		 		// for(){
//		 		
//			}                                    // 반복문이므로 3번 출력
//		}while (baseball[0] == baseball[2] | baseball[1] == baseball[2] | baseball[0] == baseball[1]);
		//do - while 문 말고 다른방법 찾아보기
		
		for (int j = 0; j < baseball.length ; j++) {           // baseball배열의 개수보다 작을때까지 반복 
			baseball[j] = (int)(Math.random()*10);            // 0 < Math.random < 1  //임의의 숫자 출력
	 		for (int z = 0; z < j; z++) {
	 			while(baseball[j] == baseball[z]) {           //baseball[j]와 baseball[z]가 같을때까지 반복
	 				baseball[j] = (int)(Math.random()*10);    //baseball[j]에 랜덤숫자 저장
//	 			if (baseball[j] == baseball[z]) {
//	 				j--;
	 				
	 			}
	 		}
	 		System.out.print(baseball[j]);
		}
		
		
		OUT: for (int k = 0; k < 5; k++) {
			int strike = 0, ball = 0; // strike와 ball의 개수를 세어줄 변수 선언
			// 2. 사용자 입력값 받기
			Scanner input = new Scanner(System.in);
			System.out.println("숫자입력->"); // 숫자 세개를 입력

			String temp = input.nextLine(); // 입력받은 숫자를 temp에 저장
			StringTokenizer st = new StringTokenizer(temp);
			// tokenizer로 문자열을 자름
			for (int i = 0; st.hasMoreTokens(); i++) { // boolean형 hasmoretokens를 이용하여 조건만듬
				String token = st.nextToken(); // 자른 토큰을 token에 저장
				answer[i] = Integer.parseInt(token); // i에 잘라진 token을 정수화해서 저장

			} // for i

			// 값비교
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (baseball[i] == answer[j]) { // 같은 값을 찾음 // **baseball과 answer에 같은 숫자가 있는지만 비교
						if (i == j) { // **i와 j의 숫자가 같음
							strike++;
						} else {
							ball++;
						}
					} // for j
				}
			} // for i
				// 4. strike, ball 출력
			System.out.println("strike : " + strike + " ball :" + ball);
			if (strike == 3) {
				System.out.println("끝");
				break OUT;
			}

		} // for k
	}
}
