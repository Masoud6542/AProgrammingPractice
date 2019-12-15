import java.util.Scanner;
public class CalculatorTest2
{
	public static void main(String[] args)
	{
		OperationCenter Calculator = new OperationCenter(num[]);
		Calculator.operands();
		
	}
}
class OperationCenter
{
	
	String[] operands;
	OperationCenter(String[] operands)
	{
		this.operands = operands;
	}
	Scanner input = new Scanner(System.in);
	
	protected double operands()
	{
		
		for (int i=0; ;i++)
		{
			operands[i] = input.next();
			if (operands[i] == "=")
			break;
		}
		return 20.0;
	}
	private double operator()
	{
		return 0.2;
	}
	
}

