package e_method;

import java.util.Scanner;

public class Ex05_Practice {

	public static void main(String[] args) {
		
		char[][] result = input(); //input() 메쏘드 실행 // 리턴된 result배열을 result에 저장
		output(result);   // output메쏘드로 result배열을 넣어줌

	}
	
	/*두 정수와 알파벳 문자하나를 입력받기
	 * 예 ) 3 4 F 입력 
	 * 
	 */
	
	static char[][] input() {
		Scanner input = new Scanner(System.in);
		System.out.print("두 정수와 알파벳 문자하나 입력 ->");
		int first = input.nextInt();
		int second = input.nextInt();
		char alpha = input.next().charAt(0);
		
		char result[][] = makeSquare(first, second, alpha); //makeSquare 메쏘드 실행 후 result배열에 저장
		return result; //result[][]가 아닌 result              //result배열을 ㄷ또다시 리턴
	}
	
	static void output(char[][] ch) { // result배열을 불러와서 넣어주기위해 ch배열 선언
		for(int k = 0; k < ch.length; k++) {      
			for (int z = 0; z < ch[k].length; z++) {
				System.out.print(ch[k][z] + " ");    // 출력
			}
			System.out.println();
		}
	}
	
	/*
	 * 입력받은 첫번재 정수만큼의 행과 두번재 정수만큼의 문자배열을 만들어
	 * 입력받은 문자로 시작하는 알파벳을 저장하세요
	 * F G H I
	 * J K L M
	 * N O P Q
	 */
	
	static char[][] makeSquare(int first, int second, char alpha) {
		char [][]ch = new char[first][second];  
		for(int k = 0; k < first; k++) {
			for (int z = 0; z < second; z++) {
				ch[k][z] = alpha;
				alpha++;              // 배열 생성
			}                
		}
		return ch; //ch[][]가 아닌 ch    //생성된 메쏘드를 반환
	}

}
