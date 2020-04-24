 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		// Short Circuit Logic : 일반논리한테만 발생하는 개념
		// 하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않습니다.
		int a = 3;
		if ( a> 3 && ++a > 3) {
			System.out.println("Ok");
		}
		System.out.println("a =" + a);
		
		if( a>1 || ++a>3) {
			System.out.println("Ok2");
		}
		System.out.println("a =" + a); //출력되고 a는 4출력 //출력되지만 뒤는 실행하지 않아서 a는 3이 출력됨 
	}

}


//일반논리대신 이진논리 사용할 것. (실행결과 : a = 4, Ok2, a =5출력함)