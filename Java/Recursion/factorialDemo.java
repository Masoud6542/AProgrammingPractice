class factorial
{
	int fact(int n)
	{
		int result = 0;
		if (n == 1) return 1;
		result = fact(n-1)*n;
		return result;
	}
}

public class factorialDemo
{
	public static void main(String[] args)
	{
		factorial f1 = new factorial();
		System.out.println(f1.fact(9));
	}
}
