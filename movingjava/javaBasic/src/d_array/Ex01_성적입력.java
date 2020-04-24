package d_array;

import java.util.*;

public class Ex01_성적입력 {
		
	public static void main(String[] args) {
		//학생 점수를 입력받아 평균구하기
		
		//입력형식 : 80/88/77
		//출력형식 : 총점 : xxx
		//        평균 : xxx
		
		
		int[]score = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력( / / )");
		String temp = input.nextLine();
		StringTokenizer st = new StringTokenizer(temp,"/");
		

		
		int total = 0;
		double avg = 0;
		
		for (int i = 0; st.hasMoreTokens() ; i++) {
			String token = st.nextToken();          //자른 토큰을 토큰변수에 입력
			score[i] = Integer.parseInt(token);//저장된 토큰을 정수화해서 스코어에 저장
			
			total += score[i];
			avg = (double)total/3;
			}
	
		
		System.out.println("총점 :" + total );
		System.out.println("평균 :" + avg);

	}

}
