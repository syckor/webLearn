package c_control;

public class Ex04_for중첩Practice {

	public static void main(String[] args) {
        for (int j = 0; j < 26; j++) {                   //알파벳의 개수만큼 조건, 범위 설정
        	for (char ch = 'A' ; ch <= 'A'+j; ch++) {    // 시작은 A이고 이후로 하나씩 증가하므로 A에 1을 더해줌
        		System.out.print(ch);                    // 알파벳이 담긴 변수 출력
        	}
        	System.out.println();                        // 두번째 for문이 끝나면 줄바꿈
         }
		
		

//        [문제2]
		for ( int j = 0; j < 26 ; j ++) {               
			for(char ch  = 'A' ; ch <= 'Z'-j; ch++) {   // 시작은 A~Z이고 이후로 끝 알파벳이 하나씩 감소하므로 Z에 하나 빼기
		                                                
		     System.out.print(ch);
			}
			System.out.println();
		}

//		[문제3]

		for(int i=0; i<26; i++) {
			   for(char ch=(char)('A'+ i) ; ch<='Z'; ch++) {   // A에 하나를 더해줘서 두번재줄부터 앞글자가 하나씩 사라지게 해줌
			    System.out.print(ch);
			   }
			   System.out.println();
			 
			  } 
        		
        		
		
//      [문제4]		
		for ( int j = 0; j <26 ; j ++ ) {
			for ( char i = 'Z'; i >= 'Z' -j ; i--) {  
			   System.out.print(i);
		       }
        System.out.println();
		}
		
//	    [문제5]
		
		for(int i=0; i<26; i++) {
			   for(char ch=(char)('A'+i); ch<='Z'; ch++) {
			    System.out.print(ch);
			   }
			   System.out.println();
			   for (int j=0; j<=i; j++) {
			    System.out.print(" ");
			   }
			  } 
			

	}

}
