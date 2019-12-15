import javax.swing.JOptionPane;

public class joption{
	public static void main(String[] args){
		String numberone = JOptionPane.showInputDialog("enter your number");
		String numbertwo = JOptionPane.showInputDialog("enter the second numebr");
		int numone, numtwo, sum;
		numone = Integer.parseInt(numberone);
		numtwo = Integer.parseInt(numbertwo);
		sum = numone + numtwo;
		JOptionPane.showMessageDialog(null, "the sum is" + sum);
	}
}
