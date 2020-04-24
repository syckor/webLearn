package e_method;

public class Ex06_main인자 {

	public static void main(String[] args) {
		
		for(int i = 0; i < args.length ; i++) {
			System.out.println(args[i]);
		}
		System.out.println("위의 정보로 서버접속");
		
	}

}
/*
 직접 운영체제에서 자바 실행할 때
 1. 자바 컴파일 (Hello.java file -> Hello.class file)
     javac Hello.java
 2. 자바 실행 ( Hello.class )
 	java Hello

	문자열을 입력하며 실행
		java Ex06_main인자 서버ip 서버계정 서버비번 //실행하면서 박아줌

*/