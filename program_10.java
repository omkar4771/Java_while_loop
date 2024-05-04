package while_loop;

public class program_10 {

	public static void main(String[] args) 
	{
		int n=12340,n1,a=0,b=0,c=0;
		
		while(n>0)
		{
			n1=n%10;
			n=n/10;

			if(n1==0)
			{
				a++;
			}
			else if(n1%2==0)
			{
				b++;
			}
			else 
			{
				c++;
			}
		}
		System.out.println("no of Zero degits = "+a);
		System.out.println("no of even degits = "+b);
		System.out.println("no of odd degits = "+c);
	}

}
