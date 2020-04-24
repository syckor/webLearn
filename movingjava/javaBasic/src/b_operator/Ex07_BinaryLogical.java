package b_operator;

//    이진논리 : &(and)   | (or)  ^(xor) 두개의 신호가 다를때만 적용 (두개가 모두 같거다 다른댄 적용 x )
//


public class Ex07_BinaryLogical {

	public static void main(String[] args) {
		
		int a = 15; // 1111
		int b = 10; // 1010
		
		System.out.println(a & b); // 1010 10
		System.out.println(a | b); // 1111 15
		System.out.println(a ^ b); // 0101 5
		


	}

}
