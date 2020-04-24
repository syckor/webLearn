package e_method;

public class Ex03_2CallByRef {
	/**
	 *  메소드의 인자가 참조형인 경우
	 *  		-> 주소 복사됨
	 *  		call by reference 
	 */
	
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		add(a,b);// 주소값을 보내서 수정이 됨
		System.out.println("A =" + a + ", B = " + b);
	}
	
	static void add(StringBuffer a,StringBuffer b) { //주소를 복사해서 가져옴
		//a += b;
		a.append(b);
		System.out.println("A =" + a + ", B = " + b); 
	}

}
