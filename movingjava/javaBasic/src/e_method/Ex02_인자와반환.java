package e_method;

public class Ex02_인자와반환 {

	public static void main(String[] args) {
		// 데이타 입력
		int a = 10, b = 20; //main함수안에서만 사용가능한 변수
		add(a, b);          //add함수로 a,b를 보내준다

	}
	static void add(int a, int b) { //받는 변수형 입력해줌
		// 입력받은 데이타의 합을 구해서 출력
		int sum = a + b; 
		System.out.println("합 : " + sum);
	}
}
