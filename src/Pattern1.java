import java.util.*;
public class Pattern1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
