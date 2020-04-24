package c_control;

public class Ex04_for중첩 {

	public static void main(String[] args) {
		
		//*
	    for (int j = 0; j<6 ; j++) {     //5줄
	    	for (int k = 0; k < j ; k ++) {
	    		System.out.print("1");
	    	}
			for (int i = 0; i<6-j ; i++) {   //5개
			    System.out.print("*");		
			}
			System.out.println();
		}
        
		
		//--------------------------------------------
		// A~Z 한줄에 출력
		
		
//		for ( int j = 0; j <26 ; j ++ ) {
//		    for ( char i = 'A'; i <= 'A' +j ; i++) {
//			   System.out.print(i);
//		       }
//		    System.out.println();
//		}
				
		

	}

}
