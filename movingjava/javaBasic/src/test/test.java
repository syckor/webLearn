package test;

import java.util.Hashtable;

public class test {
 
 public static void main(String[] args) {
 
	 	Hashtable<String, String>  table = new Hashtable<String, String>(); //해쉬맵 선언
		table.put("javassem", "1111"); // javassem이 key이고 1111이  value임
		table.put("javassem", "1234"); // 위의 javassem/1111을 덮어버림?
		table.put("kimssem", "1234"); 
		table.put("kimjava", "9999");
		table.put("kimbabo", "1234");
		
		Hashtable table1 = new Hashtable();
		table1.put("parkssem", "0000");
		table1.put("leessem","0001");
		
		table.putAll(table1);     //putAll은 두개의 맵을 하나로 합칠 수 있음
		System.out.println(table);
		
		//get()을 이용, key값을 알면 value를 찾을 수 있음 
		System.out.println(table.get("javassem")); 
		
		//keySet()과 Values()
		System.out.println(table.keySet()); //key들을 확인할 수 있다
		System.out.println(table.values()); //Value들을 확인할 수 있다
		
		//remove()에서 원하는 자료 삭제
		table.remove("parkssem");
		System.out.println(table); //map에서 parkssem이 지워진 것을 확인할 수 있음
		
		//replace()에서 원하는 key의 value값을 변경 가능
		table.replace("javassem", "qwer");
		System.out.println(table.get("javassem"));
		
		//인자를 넣는 replace()도 있는데 
		//구조는 public boolean replace(key, oldValue, newValue)이다
		//oldValue값이 기존의 값이 같아야 value가 바뀐다
		table.replace("javassem", "qwee", "1111"); //oldValue다르게 입력
		System.out.println(table.get("javassem"));//qwer이 출력됨
		table.replace("javassem", "qwer", "1111");//oldValue 맞게 입력
		System.out.println(table.get("javassem"));//1111 출력	
	}
}

