package d_array;

public class Ex04_bubbleSort {

	public static void main(String[] args) {
		
		int [] score = new int[] {4,6,9,1,2};
		
		for(int i = score.length-1; i>0; i--) {
			for(int j = 0; j < i ; j++) {
				if(score[j] > score[j+1]) {
					//swapping
					int temp = 0;
					temp = score[j+1];
					score[j+1] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int a = 0; a < score.length; a++)
			System.out.print(score[a] + "/");

	}

}
