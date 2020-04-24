package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> list = method();
	//여기서 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(Student data: list) {
			System.out.println(data);
		}
		
		
	}
	
	static ArrayList method() {
		//세명의 학생정보를 저장 : ArrayList이용
	
		ArrayList<Student> list = new ArrayList<Student>(3);
		list.add(new Student("김씨",20));
		list.add(new Student("박씨",21));
		list.add(new Student("이씨",22));
		
		return list;
	}
	

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
