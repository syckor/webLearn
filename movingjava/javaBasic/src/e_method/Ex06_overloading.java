package e_method;

/*
*  오버로딩
*	-인자의 자료형과 개수가 다른 동일한 함수들
*	-리턴형만 다른 함수는 오버로딩이 아닙니다.
*	
*/


public class Ex06_overloading {

	public static void main(String[] args) {
		//각각의 자료형 변수의 값에 "화이팅"을 더하여 출력
		String str = new String("홍글순");
		StringBuffer sb = new StringBuffer("홍길자");
		char []ch = new char[] {'홍','길','이'};
		
		fighting(str);
		fighting(sb);
		fighting(ch);
	}
	
	static void fighting(String str) {
		System.out.println(str + "화이팅");
	}
	static void fighting(StringBuffer sb) {
		System.out.println(sb.append("화이팅"));  //println이 StringBuffer를 문자열로 처리해줌 
	}
	static void fighting(char []ch) {
		StringBuffer st = new StringBuffer();
		for(int i = 0; i < ch.length; i++) {
			st = st.append(ch[i]);
		}
		System.out.println(st + "화이팅");
	}

}
