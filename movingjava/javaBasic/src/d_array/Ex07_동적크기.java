package d_array;

public class Ex07_동적크기 {

	public static void main(String[] args) {

		
//		char [][]star  = new char[5][]; // 5줄짜리 배열을 만들건데 칸은 나중에 정해줄거야
//		
//		for (int i = 0; i < star.length; i++) {
//			
//			star[i] = new char[i+1];    // i번째줄에 new를 통해 i+1번재 칸을 설정
//			
//			for(int j = 0; j < i+1 ; j++) {
//				star[i][j] = '*';
//			}
//		}
//		for (int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length ; j++) {
//				System.out.print(star[i][j] + " ");
//			}
//			System.out.println();
//		}	

//		[문제1]
		int [][]a = new int[][] {{3,-5,12},{-2, 1, 2, -7},{ -21, -35, -93, -11}, {9, 14, 39, -98}};
		int sum[] = new int[a.length];
		int max = 0;
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = a[i].length-1 ; j >= 0; j--) {
				sum[i] = sum[i] + a[i][j];
			}
		}	
		for (int k = 0; k < sum.length; k++) {
			if(sum[k]>max) {
					max = sum[k];
			}			
		}
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]==max ) {
				System.out.println(i);
			}
		}
		
	//	[문제2]

		
	}

}
 
