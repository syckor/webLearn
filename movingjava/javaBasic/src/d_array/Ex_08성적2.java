package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_08성적2 {

	public static void main(String[] args) {
		//학생수를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("학생수 :");
		int student = input.nextInt();
		input.nextLine();              //개행할때 입력했던 Enter를 처리해주는 문장
		//점수를 저장할 변수(score)를  학생수만큼 선언
		int [][]score = new int[student][3];
		
		// 입력
		for( int i = 0; i<score.length; i++) {
			System.out.printf("%d번째 학생의점수를 입력 ( / / ): " , i + 1);
			String temp = input.nextLine();
			StringTokenizer st = new StringTokenizer(temp,"/");
			for (int j = 0; st.hasMoreTokens() ; j++) { 
				String token = st.nextToken(); 
				score[i][j] = Integer.parseInt(token);
			}			
							 
		}
		// 출력
		for(int i = 0; i < score.length; i++) {
			int sum[] = new int[score.length];
			double avg[] = new double[score.length];
			for(int j = 0; j < score[i].length ; j++ ) {
				 
				sum[i] = sum[i] + score[i][j];
				avg[i] = sum[i]/(double)score[i].length;
			}
			System.out.println((i+1) + "째 학생의 총점은" + sum[i] + "이고 평균은" + avg[i] + "입니다");
		}
		System.out.println("------------------------------------------------");
		//과목별 총점,평균 출력
		for(int i = 0; i < 3; i++) {
			int subject[] = new int[3];
			double avg_subject[]= new double[3];
			String name_subject[] = {"국어", "영어", "수학"};
			for(int j = 0; j < score.length; j++) {
				subject[i] = subject[i] + score[j][i];
				avg_subject[i] = (double)subject[i]/student;
				
			}
			System.out.println( name_subject[i] +"과목의 총점은 " + subject[i] + "이고 평균은 " + avg_subject[i] + "입니다.");
		}
		
		
	}

}
