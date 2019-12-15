class gen<T>
{
	T ob;
	gen(T o)
	{
		ob = o;
	}
	T getob()
	{
		return ob;
	}
	void showType()
	{
		System.out.println(ob.getClass().getName());
	}
}
public class GenericsTest1
{
	public static void main(String[] args)
	{
		gen<Integer> iob = new gen<Integer>(88);
		iob.showType();
		int v = iob.getob();
		System.out.println(v);
	}
}
