package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();//중복 빼주고 정렬
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");//1
		set.add("lion");//2
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snack");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		

	}
}
