package d_array;

public class Ex07_복습 {

	public static void main(String[] args) {
		// 1. 3 x 4의 char 형 배열 ch를 선언
		char [][]ch = new char[3][4];
		
		// 2. 값입력
		char al = 'A';
		for(int i = 0; i < ch.length ; i++) {
			for(int j = 0; j < ch[i].length ; j++, al++) { //증감자리에 변수 두개도 가능
				ch[i][j] = al;
			}
		}
		
		for(int i = 0; i < ch.length ; i++) {
			for(int j = 0; j < ch[i].length ; j++) {
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
