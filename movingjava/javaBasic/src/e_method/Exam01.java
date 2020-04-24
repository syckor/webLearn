package e_method;

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		//후보수는 최대 10명 
		//vote의 개수는 100개 미만이고 최대 후보수 초과 적힐 수 없다.
		
		Scanner input = new Scanner(System.in);
		System.out.print("후보수를 입력하세요(10명 이하)");
		int n = input.nextInt();
		input.nextLine();
		System.out.println("투표결과를 입력하세요");
		String result = input.nextLine();
		
		
		
		
		StringTokenizer st = new StringTokenizer(result,",");
		int vote[] = new int[st.countTokens()];           //토큰의 개수를  세어주는 명령어 꼭 알아두자!!
			
		for (int i = 0; st.hasMoreTokens(); i++) {
			String token = st.nextToken();
			vote[i] = Integer.parseInt(token);
			
		}  //for i
		
		
		
		int sum[] = solution(n, vote); //파라미터를 꼭 넣어줘야함
		
		System.out.println(sum[0] + "번후보가" +  sum[1] + "표 받았습니다");
	}	
			
	
	static int[] solution(int n, int vote[]) {
		
		int sum[] = new int[2];
		int temp[] = new int[n];
		for (int j = 0; j < vote.length; j++) { //vote.length는 유권자수
			for (int k = 0; k < n; k++) {       // 유권자가 찍을수 있는 숫자는 n까지이고
				if (vote[j] == k + 1) {         // 0번 유권자부터 기호 1번부터 n번까지 누구를 찍었는지 확인하는과정 
					temp[k]++;               // n번후보가 몇표 나왔는지 세어줌
				}
			}
		} //for j
		int max = 0;
		int ddong = 0;
		for ( int i = 0; i < temp.length; i++) {  //후보자 수까지
			if(temp[i] > max) { // 최대표를 구하는 과정
				max = temp[i];   // 후보자의 득표수를 맥스에 넣어준다 
				ddong = i+1;
			}
			
		}
		
		sum[0] = ddong; //이것을 어떻게 나타낼 것인가?
		sum[1] = max;
		return sum;
		
	}

}
