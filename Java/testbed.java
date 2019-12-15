import java.io.*;
public class testbed
{	
	public static void main(String[] args) throws IOException
	{
		String mystring[] = new String[100];
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
	
		for (int i=0; i<100; i++){
			mystring[i] = bufferReader.readLine();
			if (mystring[i].equals("stop"))
				break;
		}
		for (int i=0; i<100; i++){
			if (mystring[i].equals("stop")){
				break;
			}
			System.out.println(mystring[i]);
		}
	}
}
	
