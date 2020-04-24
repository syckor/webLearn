package e_method;

import java.util.Scanner;

public class Ex02_Practice2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("문자입력");
//		String cha = in.nextLine();
//		char ch = cha.charAt(0);
		char ch = in.next().charAt(0);
		System.out.println(checkLower(ch));
	}
	
	static char checkLower(char ch) {
		
		if (ch >= 'A' & ch <= 'Z') {
			ch += 32;
			return ch;
			
		} else {
			ch -= 32;
			return ch;
		}
		
		
		
	}

}
