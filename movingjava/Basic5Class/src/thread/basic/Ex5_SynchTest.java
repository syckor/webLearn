package thread.basic;

class Count{
	int i;
	/*synchronized 메쏘드 전체에 씽크로하는것은 비효율적*/ void increment() { //동기화 tc1이 실행하는 동안에 다른애가 접근하지 못함
			 						//속도는 느리지만 2억이 나와야함
		synchronized(this/*객체를 반드시 줘야하는데 줄만함 애가 없어서 디스*/){//동기화해줘야할 애만 이렇게 씌어줌 
			i++;
		}
	}
}

class ThreadCount extends Thread
{
	Count cnt;
	
	ThreadCount(Count cnt){
		this.cnt = cnt;
	}
	public void run() {
		for(int i = 0; i < 1000000000; i++) {
			cnt.increment();
		}
	}
	
}


public class Ex5_SynchTest {

	public static void main(String[] args) {
		Count cnt = new Count();
		ThreadCount tc1 = new ThreadCount(cnt);
		tc1.start();
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
		
		try {
			tc1.join();//tc1이 끝날때까지 기다려주는 명령어
			tc2.join();//하지만 tc1과 tc2가 동시에 작업하므로 2억이 안나옴
			//그래서 다른애가 접근하지 못하게 막아줘야함
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		
		System.out.println("i의 결과:" + cnt.i); //tc1,tc2가 1억번씩 반복하기 전에 출력해버림
		
		
	}

}
