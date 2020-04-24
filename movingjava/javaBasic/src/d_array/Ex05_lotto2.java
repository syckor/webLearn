package d_array;

//숙제
public class Ex05_lotto2 {

	public static void main(String[] args) {
		int [][] lotto = new int [5][6]; //[5]라는 배열안에 [6]의 배열을 넣음
		// 값대입 -> ##동일숫자 배제
		for(int i = 0; i < lotto.length ; i++) { //줄 //??length = 5
			for (int j = 0; j < lotto[i].length ; j++) {  //칸   / 1 2 3 4 5 6 번재 숫자가 정해짐 lotto라는 배열에 들어간 배열의 length
				
				lotto[i][j] = (int)(Math.random()*45) + 1; //i번째줄 j번재칸에 대입해주세요  00. 01, 02. 03. 04 05 10 11 12 13 14 15 21 22..... 
			//         i           					
					// 0  0 1 2 3 4 5  j
				    // 1  0 1 2 3 4 5  j
				    // 2  0 1 2 3 4 5  j             [2][0]
				for (int x = 0; x < 5 ; x++) {     //[x][y]  2번째 줄일때
					for (int y = 0; y < j ; y++) { //                   
						while(lotto[x][j] == lotto [x][y]) { //  lotto2 0   lotto  
							lotto[x][j] = (int)(Math.random()*45) + 1;
						}
					}
				}
			}
		}
		
		
		//정렬
		for(int i = 0; i < 5; i++) {
			for(int k =  5; k > 0; k--) {
				for(int j = 0; j < k ; j++) {
					if(lotto[i][j] > lotto[i][j+1]) {
						//swapping
						int temp = 0;
						temp = lotto[i][j];
						lotto[i][j] = lotto[i][j+1];
						lotto[i][j+1] = temp;
					}
				}
			}
		}
		
		
		//출력
		for(int i = 0; i<5; i++) {
			for (int j = 0; j< 6 ; j++) {
				System.out.print( lotto[i][j] + "/");
			}
			System.out.println();
		}
		

	}

}
