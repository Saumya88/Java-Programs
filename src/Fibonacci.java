import java.util.*;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int number,a,b,c;
		number=sc.nextInt();
		a=0;
		b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<number;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		sc.close();
		
		
	}
}

