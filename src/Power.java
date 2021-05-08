import java.io.*;
public class Power 
{
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number,power,answer=1;
		System.out.println("Enter the number");
		number=Integer.parseInt(br.readLine());
		System.out.println("Enter the power");
		power=Integer.parseInt(br.readLine());
		for(int i=0;i<power;i++)
		{
			answer=answer*number;
		}
		System.out.println(answer);
	}
	

}
