package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		/*
		// [1]
		System.out.println("a=" + a + ",b=" + b);
		System.out.println("a=" + a+1 + ",b=" + b+1); //51 71 문자열과 섞여서 문자열 취급
		System.out.println("a=" + (a+1) + ",b=" + (b+1)); //6 8 
		
		// [2]
		a++;  //a = a + 1;
		b--; //b = b - 1;
		System.out.println("a=" + a + ",b=" + b); // 6 6
		
		++a;  //a = a + 1;
		--b; //b = b - 1;
		System.out.println("a=" + a + ",b=" + b); // 6 6
        
		//[3] 증가감소연산자는 위치가 중요함 !!!!!!
		int result = ++a;
		System.out.println("결과 :" + result); //6
		
		int result2 = b--;
		System.out.println("결과 :" + result2); //7 b를 먼저 result2에 넣고 감소됨. 
		System.out.println("b :" + b); //6    // 그 후 b를 출력되면 1이 감소된 값이 출력.
		*/
		//[4]
		System.out.println("a=" + ++a + ",b=" + --b); // a = 6 b = 6
		System.out.println("a=" + a++ + ",b=" + b--); // a= 6 b = 6
		System.out.println("a=" + a + ",b=" + b);     // a = 7  b = 5
	}

}
