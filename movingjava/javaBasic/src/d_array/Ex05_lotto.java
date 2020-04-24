package d_array;


public class Ex05_lotto {

	public static void main(String[] args) {
		int []lotto = new int [6];
		// 값대입 -> ##동일숫자 배제
		for (int j = 0; j < lotto.length ; j++) {
		
			lotto[j] = (int)(Math.random()*45) + 1;   // 0 < Math.random < 1
	        
		
			for (int z = 0; z< j; z++) {
				
//				while(lotto[j] == lotto[z]) {
//					lotto[j] = (int)(Math.random()*45) + 1;
//				}
				if(lotto[z] == lotto[j]) {
					j--;
				}
			}

		}
		
		//정렬
		for(int i = lotto.length-1; i>0; i--) {
			for(int j = 0; j < i ; j++) {
				if(lotto[j] > lotto[j+1]) {
				//swapping
					int temp = 0;
					temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		for (int j = 0; j< 6 ; j++) {
			System.out.print( lotto[j] + "/");
		}

	}

}
