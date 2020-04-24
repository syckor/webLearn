package c_control;

public class Ex05_while_practice {

	public static void main(String[] args) {
//		
//		[문제] 3, 6, 9 게임 만들기
		
//		for(int i = 1; i <20; i++) {
//		int su = i;
//			boolean su369 = false;
//			if(i ==3 | i == 6 | i == 9 ) {
//				System.out.print("짝");
//				su369 = true;
//			}
//			
//			if(su369) System.out.println();
//			else System.out.println(i);
//		}


//		for(int i = 99; i <150; i++) {
//		int su = i;
//			boolean su369 = false;
//			
//			while (su != 0) {
//				int na = su % 10;
//			
//			    if (na == 3 | na == 6 | na == 9 ) {
//			    	System.out.print("짝"); //숫자에 3이 들어간다면 조건이 참이 되어서 짝을 출력
//			    	su369 = true;
//			    	}
//			    su = su / 10;              //10의 자리 숫자를 판별하기 위해서 su를 10으로 나눠줌
//				}
//			
//			
//			if(su369) System.out.println(); //숫자에 3이 아니라면 조건이 거짓이 되면서 i를  출력
//			else System.out.println(i);
	
		//[도전] 10000까지 8의 개수는?

//		int temp=0;
//		
//		for(int i = 0; i<=10000; i++  ) {
//			int su = i;	
//			
//			while(su != 0)
//				if(su%10 == 8) {
//					temp++;	
//					
//				    }
//				su = su/10;
//			
//		}
//		System.out.println(temp);     //무한루프에 빠지는 이유는?  while문에 {}빼먹음 
		
        int temp=0;
		
		for(int i = 0; i<=10000; i++  ) {
			int su = i;	           //                 888                88             8          889
			
			while(su != 0) {                           
				if(su%10 == 8) {    // 18/10 % 8       888/10 % 8      88/10 % 8    8/10 % 8
					temp++;			//1   2		         3                   4         5
				    }			
				su = su/10;                 //           888/10 - 88        88/10 - 8  8/10 = 0
			}	   
		}
		System.out.println(temp);		
		
		
	}

}
