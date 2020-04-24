package c_control;

import java.util.Scanner;

public class Exam_03_17 {

	public static void main(String[] args) {
		
		//[문제1]
//		Scanner input = new Scanner(System.in);
//		System.out.println("자연수 입력");
//		int num = input.nextInt();
//		
//		for(int i = 0; i < num ; i++) {             // 입력받은 값만큼 반복
//			for (int j = 0; j < 2*num-2*(i+1); j++) {   // 공백의 개수는 입력값의 두배이고 줄이 바뀌면 2의 배수만큼 공백이 줄어듬
//				System.out.print(" ");              // 반복적으로 공백을 한줄에 만들어줌
//			}
//			for (int k = num -(num-1); k <= i + 1  ; k ++) {  // 제일 윗줄이 1부터 시작하므로 k를 1로 만들고
//				System.out.print(" " + k);                  // k가  i가 0부터 시작하고  k는 자연수여서 1부터 시작하므로 i+1을 해줘야함
//			}
//			System.out.println();
//		}
		
		
		// [문제2]
		
//		Scanner input1 = new Scanner(System.in);
//		System.out.println("자연수 입력");
//		int nat = input1.nextInt();             //입력값 선언
//		int temp = 0;                             
//		
//		for(int i = 0; i < nat ; i++) {         // for문 : 줄의 개수는 선언한 수와 같음 그러므로 i<nat까지 실행
//			for (int k = 0; k < i ; k ++) {     // k의 개수는 공백수이므로 i값이 커질수록 공백 개수도 늘어남
//	    		System.out.print("  ");         
//			}
//			for(int j = 0; j<nat-i; j++) {     // 첫째줄의 개수는 입력값의 숫자와 같고 그다음부터 하나씩 줄어드므로 입력값에 -i를 해준다
//				temp++;                        //첫번째 위치부터 순서대로 숫자가 들어가게 만들어야하기 때문에 선언
//				System.out.print(temp);        //숫자가 1부터 차례대로 들어간다
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//      
		Scanner input2 = new Scanner(System.in);
		System.out.println("높이와 너비를 순서대로 입력하세요");
		int n = input2.nextInt(), m = input2.nextInt();

//		int num = 0;                                 // < --- 나의 식 
//		                                             // 문제2번 응용해서 num을 선언후 for문 안에서 대입
//		for (int i = 0; i < n ; i++ ) {
//			for(int j = 0; j < m; j++ ) {
//				num++;
//				System.out.print(" " + num);
//			}
//			System.out.println();
//		}
		
		for(int j = 1; j <= m*n; j++) {         // 숫자를 순서대로 대입하므로 어디까지 대입할지 구함------경호식
			                                       
			System.out.print(j + " ");          
			if(j%m==0) {                        // m이 너비이므로 j와 m의 개수가 맞으면 줄바꿈 
				System.out.println();
			}
		}
	   
			
	}

}
