package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();//중복되지 않음
		
		//for(int i = 0; lottos.size()<6; i++) {
		while(lottos.size()<6){
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}	
		//System.out.println(lottos);
		ArrayList<Integer> list = new ArrayList<Integer>(lottos);
		Collections.sort(list);
		
		System.out.println(list);
	}
}
