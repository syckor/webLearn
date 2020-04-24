/*
 * 자료형 관련 클래스 : Wrapper class
 * Byte/Short
 * Character
 * Integer/Long
 * Float/Double
 * 
 * 형변환 관련
 * 		String -> int형
 * 		Integer.parseInt()
 * 
 * 		int형 -> String
 * 		String.valueOf(10) - > "10"
 * 
 * 
 */





package c_collection;
import java.util.ArrayList;

class aArrayListEx0
{
	public static void main(String[] args) 
	{
		Object data[] = dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int p = 0; p < data.length; p++){
			System.out.println(data[p]);
		}

	}

	static Object[] dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		Object []data = new Object[3];
		data[0] = name;
		data[1] = new Integer(age);//int -> Integer 
		data[2] = new Double(height);
		
		return data;
		

	}
}
