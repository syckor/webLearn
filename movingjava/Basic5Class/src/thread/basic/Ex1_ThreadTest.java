package thread.basic;

public class Ex1_ThreadTest {

	public static void main(String[] args) {
		MakeCar1 work1 = new MakeCar1("차틀만들기");
		work1.start(); //start함수가  run()을 호출
		
		MakeCar1 work2 = new MakeCar1("엔진부착");
		work2.start();
	}
}

class MakeCar1  extends Thread{ //쓰레드 상속
	String work;
	
	MakeCar1(String work){
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
