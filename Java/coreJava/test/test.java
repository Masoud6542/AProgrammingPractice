import java.math.BigDecimal;
import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        calculation cal = new calculation();
        cal.center();
    }
}
class calculation
{
    int num1, num2;
    void center()
    {
        System.out.println("enter a number: ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        BigDecimal bigDecimal = BigDecimal(256, 2);
        System.out.println(bigDecimal);
    }
}