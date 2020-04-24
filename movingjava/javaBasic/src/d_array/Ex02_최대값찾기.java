package d_array;

public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
		int []score = new int[] {88, 61, 92, 46, 69};
		
		int max = 0;
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println(max);

	}

}
