package thread.basic;

public class Ex2_RunnableTest {

	public static void main(String[] args) {
		MakeCar2 mc1 = new MakeCar2("차틀만들기");
		//mc1.start(); //start가 쓰레드한테는 들어있지만 Runnable에는 없다 ㅜ
		Thread t1 = new Thread(mc1); //그래서 이친구들을 쓰레드를 만든다 ( )안에 mc1을 해서 꼭 연결시켜줄것!!!
		t1.start();
		
		//mc2.start(); 
		
		new Thread(new MakeCar2("엔진부착")).start(); //줄여버리기

	}

}

class MakeCar2 implements Runnable{
	String work;
	MakeCar2(String work){
		this.work = work;
	}
	
	public void run() {
		for(int i = 0; i < 5 ; i++) {
			System.out.println(work + "작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
