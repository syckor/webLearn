package test;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap  map = new HashMap(); //해쉬맵 선언
		map.put("javassem", "1111"); // javassem이 key이고 1111이  value임
		map.put("javassem", "1234"); // 위의 javassem/1111을 덮어버림?
		map.put("kimssem", "1234"); 
		map.put("kimjava", "9999");
		map.put("kimbabo", "1234");
		
		HashMap map1 = new HashMap();
		map1.put("parkssem", "0000");
		map1.put("leessem","0001");
		
		map.putAll(map1);     //putAll은 두개의 맵을 하나로 합칠 수 있음
		System.out.println(map);
		
		//get()을 이용, key값을 알면 value를 찾을 수 있음 
		System.out.println(map.get("javassem")); 
		
		//keySet()과 Values()
		System.out.println(map.keySet()); //key들을 확인할 수 있다
		System.out.println(map.values()); //Value들을 확인할 수 있다
		
		//remove()에서 원하는 자료 삭제
		map.remove("parkssem");
		System.out.println(map); //map에서 parkssem이 지워진 것을 확인할 수 있음
		
		//replace()에서 원하는 key의 value값을 변경 가능
		map.replace("javassem", "qwer");
		System.out.println(map.get("javassem"));
		
		//인자를 넣는 replace()도 있는데 
		//구조는 public boolean replace(key, oldValue, newValue)이다
		//oldValue값이 기존의 값이 같아야 value가 바뀐다
		map.replace("javassem", "qwee", "1111"); //oldValue다르게 입력
		System.out.println(map.get("javassem"));//qwer이 출력됨
		map.replace("javassem", "qwer", "1111");//oldValue 맞게 입력
		System.out.println(map.get("javassem"));//1111 출력
	
	}



}
