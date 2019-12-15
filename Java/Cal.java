import java.util.Scanner;
public class Cal
{
    public static void main(String[] args) {
        Calculation myCal = new Calculation();
        myCal.Center();
    }
}
class Calculation {
    private double operand1, operand2;
    private Scanner input = new Scanner(System.in);
    protected void Center() {

        System.out.println("Welcome");
        String ask;
        do {
            System.out.println("Input the 1st number:");
            setOperand1();

            System.out.println("Enter the desired operator (+, -. *, /)");
            String operator = input.next();

            System.out.println("Input the 2nd number:");
            setOperand2();
            operation(operand1, operand2, operator);

            System.out.println();
            System.out.println("enter q to leave, enter anything else to continue");

            ask = input.next();
        } while(!ask.equals("q"));
        System.out.println("Good luck");
    }

    private double setOperand1() {
        operand1 = input.nextDouble();
        return operand1;
    }

    private double setOperand2() {
        operand2 = input.nextDouble();
        return operand2;
    }

    private void operation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                System.out.println(operand1 / operand2);
                break;
                default:
                    System.out.println("You moron! entered anything but an operator! how hard was that?!");
        }

    }
}


