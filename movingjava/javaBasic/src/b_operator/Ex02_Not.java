package b_operator;

/**
 * 	not : 결과를 반대로 하는 연산자
 * 			- 일반논리 not :  !
 *                   true -> false, false -> true
 * 			- 이진논리 not : ~
 *                   각 비트의 값이 0 -> 1, 1 -> 0
 */
public class Ex02_Not {

	public static void main(String[] args) {
		
		boolean result = 3 > 4;
		System.out.println(result); 
		System.out.println(!result); //true
		
		int a = 15;
		System.out.println(~a); // -16 부호값이 바뀌었기 때문에 양수에서 음수로 바뀜 (쓸일없음 ㅋ )
		// a 15 : 00000000 00000000 00000000 00001111
        // ~a   : 11111111 11111111 11111111 11110000	

	}

}
