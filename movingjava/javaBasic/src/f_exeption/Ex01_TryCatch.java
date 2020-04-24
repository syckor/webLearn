package f_exeption;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String []msg = new String[] {"행복하자","끝내자","맛난거먹자"};
		try {
			for(int i = 0; i <= msg.length ; i++) {
				System.out.println(msg[i]);
			}	
			//return;
		}catch(Exception ex ) {
			System.out.println("예외처리:" + ex.toString());
		}finally {
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("프로그램 정상 종료");
	}

}

/* 
 * 오류 
 * 		-에러 : 심각한 오류 (컴파일 오류)
 * 		-예외 : 심각하지 않은 오류
 * 			-> 예외처리 : 프로그램 정상 종료를 위해
 * 		  (1) try~ catch
 * 			  	try {
 * 					예외가 발생할 구문
 * 			  	} catch ( Exception ex ){
 * 					예외가 발생한 후의 구문
 * 				} finally {
 * 					예외발생여부와 관계없이 실행하는 구문
 * 				}	
 * 		  (2) 메소드 뒤에 throws 	
 * 
 */
