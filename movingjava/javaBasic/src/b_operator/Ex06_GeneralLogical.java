package b_operator;

/*
 *  논리연산자의 상태를 먼저 확인
 *  
 *  일반논리 : &&(and)  ||(or)
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
		int 성적 = 75;
		char 태도 = 'A';
		
		//우등생 : 성적이 80점 이상이거나 태도가 'A' 조건
		
		if (성적 >= 80 || 태도 == 'A'  ) {
			System.out.println("우등생");
		} else {
			System.out.println("우등생아님");
		}

		//성적향상반 : 성적이 80점 이상이고 태도가 'A'조건
		
		if (성적 >= 80 && 태도 == 'A' ) {
			System.out.println("성적향상반");
		} else {
			System.out.println("성적향상반 아님");
			
		}
		
		
		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
 		 */


	}

}
