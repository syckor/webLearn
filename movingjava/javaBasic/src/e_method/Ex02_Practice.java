package e_method;

import java.util.Scanner;

public class Ex02_Practice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("문자입력");
		String cha = in.nextLine();
		char ch = cha.charAt(0);
//		boolean result = checkLower(ch); //이것을 바로 if문에 넣어주면 편리		
		//소문자인지 대문자인지 출력
		if(checkLower(ch))
			System.out.println("대문자");
		else 
			System.out.println("소문자");
	}
	
	static boolean checkLower(char ch) {
		 // 넘겨받은 인자 ch값이 소문자라면 return true;
		// 그렇지 않으면 return false;
		if ( ch >= 'A' & ch <= 'Z' ) {
			return true;
			//System.out.println("대문자");
		}else {
			return false;
			//System.out.println("소문자");
		}
		
		
	}

}
