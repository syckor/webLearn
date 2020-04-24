package d_array;

public class Ex01_성적 {

	public static void main(String[] args) {
//		int [] kor;
//		kor = new int[5];
//		int [] kor = new int[5];   //heap에 저장되어 자동 초기화됨
//		kor [0] = 90;
//		kor [1] = 88;
//		kor [2] = 80; 
//		kor [3] = 48;
//		kor [4] = 84;
//		//kor [5] = 96;
		
		
		// 배열 초기화
		//int []kor = new int[] {99, 88, 75, 80, 92}; //메모리를 잡자마자 값을 넣어버림 
		int []kor = /* int[]  생략가능함*/ {99, 88, 75, 80, 92};
		
		int total = 0;
		for (int i = 0; i < kor.length ; i++) {
			//총점 구하기
			total += kor[i];                        
			
		}
		System.out.println("총점 :" + total);
				
	}
	

}
