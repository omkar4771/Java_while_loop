package while_loop;

public class sum_first_and_last_digits {

	public static void main(String[] args) 
	{
		int n=2234,n1,sum=0,FD;
		FD=n%10;
		while(n>=10)
		{
			n=n/10;
		}
		System.out.println("Sum = "+(n+FD));
		
	}

}
