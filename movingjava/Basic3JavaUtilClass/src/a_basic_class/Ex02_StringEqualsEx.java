package a_basic_class;

public class Ex02_StringEqualsEx
{
	public static void main(String[] args)
	{
		String  a = new String("Hello");
		String  b = new String("Hello");
		
		if(  a == b ) System.out.println("a와 b는 같은 객체입니다.");
		else System.out.println("a와 b는 다른 객체입니다.");

		if(  a.equals( b ) ) System.out.println("a와 b는 같은 값을 가집니다.");//String class가 object꺼를 오버라이딩해서 값비교해준다
		else System.out.println("a와 b는 다른 값을 가집니다.");

	}
}

