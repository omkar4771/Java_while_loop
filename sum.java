package while_loop;
import java.util.*;
public class sum 
{
	public static void main(String[] args) 
	{	int n,sum=0,n1;
		System.out.println("Enter the range");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0)
		{	
			n1=n%10;
			n=n/10;
			sum=sum+n1;
			
		}
		System.out.println("sum = "+sum);

	}

}
