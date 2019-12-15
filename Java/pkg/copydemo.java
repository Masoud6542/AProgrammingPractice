package pkg;

class copy
{
	static int a;
	void setInt(int b){
		a = b;
	}
	int getInt(){
		return a;
	}
}


public class copydemo
{
	public static void main(String[] args)
	{
		
		copy test = new copy();
		test.setInt(154);
		System.out.println(test.getInt()*2);
		
	}
}

