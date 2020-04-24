package a_datatype;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		// 나이와 키를 입력받아서 출력
		
		//int age;
		//Double hei;
		//String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = input.nextInt(); //변수 설정후 바로 값을 대입
		
		System.out.print("키 :");
		double hei = input.nextDouble();
		
		
		System.out.print("이름 : ");
		
		String name = input.nextLine(); //키의 값을 입력할 때 사용한 Enter를 먹기 때문에 읫줄에 의미없는 명령어 추가. 
		
		System.out.println("나이 :" + age  + ", 키 :" + hei + ", 이름 :" + name);
		
		
		

	}

}
