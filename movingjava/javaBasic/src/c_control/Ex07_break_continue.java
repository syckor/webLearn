package c_control;

public class Ex07_break_continue {

	public static void main(String[] args) {
		
		
		
		HERE: //라벨
		for ( int i = 0; i < 4 ; i++) {
			for(int j = 0; j < 3  ; j++) {
				if(j == 1)  break; //블럭 벗어나는 문장(반복 벗어나기)
				//if(j == 1)  continue; // 블럭 끝으로 가기( 반복은 수행함) 건너 뛰는 느낌 ??
				//if(j == 1)  break HERE; // 라벨이 붙은 for문을 빠져나감
				//if(j == 1)  continue HERE; // 라벨이 붙은 for문의 끝으로 감 (반복수행)
				System.out.printf("< %d, %d> \n", i, j); 
			}
			System.out.println("데이타");
		}

	}

}
