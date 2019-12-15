class mythread implements Runnable
{
	Thread t;
	mythread(){
	t = new Thread ( this, "my cool thread");
	System.out.println(t);
	}
	public void run(){
		try{
			
			for (int i=5; i>0; i--){
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println(e);
		}
	}

}

public class test
{
	public static void main(String[] args)
	{
		mythread x = new mythread();
		x.t.start();
	}
}
