public class Box
{
	double x,y,z;
	
	Box(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	double volume()
	{
		return x*y*z;
	}
}
