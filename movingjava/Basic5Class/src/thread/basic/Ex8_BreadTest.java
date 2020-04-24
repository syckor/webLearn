package thread.basic;

class Bread 
{
	String bread;

	//##  	
	boolean isCheck = false;
	public void setBread( String bread )//얘가먼저 불려져야함 
	{
		this.bread = bread;
		//## 		
		isCheck = true;
		synchronized (bread) {
			notifyAll(); // block(sleep)에 있던 애들을 다 끌어내림 //얘를 하는동안에도 동기화
		}
		
	}	

	public String getBread()
	{
		//## 		
		if(!isCheck == false) {
			try {
				synchronized(bread) {
					wait(); //sleep을 해야하는데 얼마만큼 해야할지 모르겠을때 wait를 하고
							//notifyAll로 다 불러와야함 // 이거하는 순간에 동기화해야함
				}
			} catch (Exception e) {
			}
		}
		return bread;
	}
}

class Baker extends Thread
{
	Bread bbang;

	Baker( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		bbang.setBread("진열된 완성된 맛있는 빵");
	}
}

class Customer extends Thread
{
	Bread bbang;

	Customer( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class Ex8_BreadTest
{
	public static void main(String[] args) 
	{
		Bread  bread = new Bread();

		Baker  baker = new Baker( bread );
		Customer customer = new Customer( bread );
		customer.start();
		baker.start();

		try{
			customer.join();
			baker.join();			
		}catch( Exception ex ){}

	}
}
