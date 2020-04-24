package c_control;

import java.util.Scanner;

public class Ex06_do_while {

	public static void main(String[] args) {
/*		while(true) {                                             //while문은 조건이 False면 수행하지 않지만 do-while문은 무조건 한번은 수행한후 조건비교함
			Scanner input = new Scanner(System.in);
			System.out.println("숫자 입력");
			int num = input.nextInt();
			
	//		int i = 1;
			for(int i =0 ; i<10; i++) {
			//while (i<10) {
				System.out.printf("%d*%d = %d \n", num, i, num*i);
	//			i++;
			}
		    System.out.println("구구단 다시 할까요?");
		    String result = input.next();
		    if( result.equals("N")|result.equals("n")) break;
*/
		
		String result = "";
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("숫자 입력");
			int num = input.nextInt();
			
	//		int i = 1;
			for(int i =0 ; i<10; i++) {
			//while (i<10) {
				System.out.printf("%d*%d = %d \n", num, i, num*i);
	//			i++;
			}
		    System.out.println("구구단 다시 할까요?");
		    result = input.next();
		    //if( result.equals("N")|result.equals("n")) break;
		} while(result.equals("Y")|result.equals("y"));   //True면 반복, False면 끝냄
		
		// break : 블럭 벗어나는 문장
		// continue : 블럭 끝으로 가는 문장
		

	}

}
