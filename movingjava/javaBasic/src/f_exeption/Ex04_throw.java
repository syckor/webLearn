package f_exeption;

public class Ex04_throw {

	public static void main(String[] args) {
		
		try {
			readArray();                     //던져진 예외를 받기위해서 try문을 씌어줌
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
	
	static void readArray() throws Exception { //예외를 밖으로 던짐
		try {
			String[] msg = new String[] { "행복하자", "끝내자", "맛난거먹자" };
			for (int i = 0; i <= msg.length; i++) {
				System.out.println(msg[i]);
			}
		} catch (Exception ex) {
			//System.out.println("예외발생:" + ex.getMessage());
		    throw new MyException(); //throw로 에외를 만들어줌
		}	
		
	}

}
