package a_datatype;

public class ddd {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 3;
		
		int temp = a;
		
		if(a>b) {
			temp = b;
		}
		else if (c>temp) {
			temp = c;
			if(b<c) {
				temp = b;
			}
		}
		System.out.println(temp);

	}

}
