package e_method;

public class Ex03_인자와반환3 {

	public static void main(String[] args) {
		
		int []arr = add();
		// 데이터를 넘겨받아 합을 구하고 출력
		int sum = arr[0] + arr[1];
		System.out.println("합 :" + sum);
	}
	
	static int[] add() {
		//입력데이타
		int a = 10, b = 20;
		int [] arr = {a, b};
		return arr;
	}

}
