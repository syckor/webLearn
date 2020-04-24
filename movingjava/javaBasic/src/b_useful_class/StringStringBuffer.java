package b_useful_class;

public class StringStringBuffer {

	public static void main(String[] args) {
		
		// 0. 기본형
		int a = 10;
		a += 5;
		System.out.println(a);
		
		//1. String : 참조형
		// String s = new String("안녕"); 원래는 이게 정상
		String s = "안녕";
		s = s + "하세요";     
		//s = "안녕"이라는 메모리가 남아있음 자바는 이것을 자동으로 지워주는 가베지 컬렉터가 있지만 사용자가 원할때 컬렉트 되지 않을수도
		System.out.println(s); 
		
		//2. StringBuffer
		StringBuffer sb = new StringBuffer("행복한");
		//StringBuffer sb2 = "행복한";
		//sb = sb + "목요일";   //자유롭게 연산할 수 있는것도 String의 특권
		sb.append("목요일");  //StringBuffer는 메모리를 새로 만들지 않고 sb뒤에 이어붙임 속도가 String보다 월등히 빠름 
		System.out.println(sb);
		
		
		
	}

}
