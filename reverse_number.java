package while_loop;
import java.util.*;
public class reverse_number 
{

	public static void main(String[] args) 
	{
		int n,n1,sum=0;
		System.out.println("Enter the number..");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
			System.out.println("reverse sum = "+sum);
	}

}
