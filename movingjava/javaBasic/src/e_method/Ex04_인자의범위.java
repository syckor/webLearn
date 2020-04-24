package e_method;

public class Ex04_인자의범위 {
	// 멤버변수 (모든 클래스에 쓸 수있음) heap에 잡힘
	static int a, b;
	static int sum;
	
	public static void main(String[] args) {
		// 데이타 입력
		//int a = 10, b = 20 // 지역변수 (메쏘드 안에서만 사용가능) stack에 잡힘
		int a = 10; //우선순위가 지역변수가 더 높아서 새로운 변수를  만들어버림
		b = 20; 
		add();
		System.out.println("합 : " + sum);
	}
	static void add() { 
		
		sum = a + b; 
		
	}

}
