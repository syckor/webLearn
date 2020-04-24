package c_control;

import java.util.Scanner;

public class Exam_03_18 {

	public static void main(String[] args) {
		// 높이 n과 m을 입력받은 후 사각형 형태로 1부터 n*m번까지 숫자가 차례로 출력
		
		// [문제1]
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 차례대로 입력");
//		int n = input.nextInt();
//		int m = input.nextInt(); //n은 높이, m은 너비
//		
//		
//		int temp = 0;
//		
//		for ( int i = 1; i<= n; i++) {
//			for(int j = 1; j<=m; j++) {
//				temp++;
//				System.out.print(" " + temp);
//			}
//			System.out.println();
//		}
		
		
		// [문제2]
//		Scanner input1 = new Scanner(System.in);
//		System.out.println("자연수를 입력");
//		int num = input1.nextInt();
//		
//		
//		int temp1 = 1;
//	
//		for( int i = 1; i <=num; i++) {
//			for(int j = 1; j <=num; j++ ) {
//				
//				System.out.print(temp1 + " ");
//				temp1 += num; 
//			} 
//			System.out.println();
//			temp1 = temp1-(num*num-1) ;
//			
//		}
		
		//[문제3]
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("자연수를 입력");
		int n = input2.nextInt();
		int m = input2.nextInt();
		
		
		int t = 1;
		boolean boo = true;
		while( t <= n*m) {
			System.out.print(t+ " ");     //t 1을 출력                                                                    t는 4를 출력
			if(boo) {                        // true이므로 if문 실행                                               실행
				t++;                             // t는 2가됨                                                       티는 5가되고
				if(t%m == 0) {                         //0 이 아니므로 실행안함 다시 반복문 실행        0이므로 반복문
					System.out.println(t + " ");   //                                  티 5를 출력
					t += m ;     //                                                    티는 5+= ㅣㅇ므로 10
					boo = false;                                                  // if가 false가 되서 else  실행
				}
			} 
			else { 
				t--;                                             // 부는 false로 바뀐것 뿐이고 반복문 실행 10을 출력뒤 9
				if(t%m == 1) {                                  // 1이 아님 실행안함 위에서 9 8 7 순서대로 출력 후 6이되면      
					System.out.println(t + " ");                // 6을 출력후 
					t += m;                                     // 티를 11로 만들고
					boo = true;                                  //이걸 트루로 만듬 그럼 11부터 다시 시작
				}
			}
		}		
	}
}
















