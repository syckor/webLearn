package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while_basic {

	public static void main(String[] args) {
		
		// 1~10까지의 합을 출력
//		int total = 0;
//		int i = 1;
//		//for(   ; i<11;  ) {
//		while( i<11) {        //조건문만 갖고 들어감	
//		    total += i;
//			i++;
//		}
//		System.out.println(total);
		
		//숫자 하나 입력받기 -> 구구단 출력

//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		int num = input.nextInt();
//		
//		int i = 1;
//		// for(int i ; i<10; i++) {
//		while (i<10) {
//			System.out.printf("%d*%d = %d \n", num, i, num*i);
//			i++;
//		}

		//문장을 입력받아 단어로 나눠서 출력
		// " 빨리 코로나 끝났으면 좋겠다"
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("점수를 입력하세요");
//		String line = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line,"/");  // (쪼갤문장, 쪼개는 기준(입력이 없으면 띄어쓰기))   
//
//		while(st.hasMoreTokens()) {    //boolean형, 토큰이 더 있으면 True 없으면 False
//			String temp = st.nextToken();
//			int su = Integer.parseInt(temp); // String -> int 형변환
//			System.out.println(su);
//		}
		
       // 문 제		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String num = input.nextLine();
		StringTokenizer st = new StringTokenizer(num);  //문장을 자르는 클래스를 가져와서 입력만 문장을 넣음
		
		int even = 0; //짝수의 개수를 세는 변수 설정
		int odd = 0;  //홀수의 개수를 세는 변수 설정
		while(st.hasMoreTokens()) {        // 토큰이 더 없을때까지 반복
			String temp = st.nextToken();   // 토큰을 temp에 저장
			int su = Integer.parseInt(temp); //저장된 값을 정수형으로 바꾸어줌
			
			if(su%2 == 0) {                 //저장된 값이 짝수인지
				even++;                     // 맞다면 even의 수를 하나씩 증가
			}else if(su%2 ==1) {            //홀수인지
				odd++;                      // 맞다면 odd를 하나씩 증가
			}                               // while문에 의해 계속 반복
		}
		System.out.println("짝수 :" + even);
		System.out.println("홀수 :" + odd);
		
	}

}
