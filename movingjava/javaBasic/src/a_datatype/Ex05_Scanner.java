package a_datatype;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		// 1 .국(kor), 영(eng), 수(math) 점수를 저장할 변수를 선언하고 값을 지정
        //int kor = 90;
		//int eng = 88;
		//int math = 94;
		int kor=0, eng=0, math=0;
		
		//입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("국어점수 ->");
		kor = input.nextInt();
		
		System.out.print("영어점수 ->");
		eng = input.nextInt();
		
		System.out.print("수학점수 ->");
		math = input.nextInt();
		
		// 2. 총점 구하기
		//System.out.println(kor + eng + math);
		int total = kor + eng + math;
		System.out.println("총점  " + total);
		
		// 3. 평균 구하기
		//System.out.println((kor + eng + math)/3);
		double avg = (double)total/3; //(total/3)이 int형이고 결과값이 실수형이 나올 수 있으므로 Casting해줌
		System.out.println("평균  " + avg);
		
	}

}

/*
# next() 와 nextLine() 차이점

	next()는 \n \t 같은 문자를 만나면 그 전까지 읽는다
	nextLine()은 \n 개행문자까지 읽어서 한 줄임을 인식한다.
	
	[ 예 ] 오늘도 우리는 행복이 의무다
	
	next()는 4개의 토큰으로 인식하지만
	nextLine()은 한 줄로 인식한다.
*/