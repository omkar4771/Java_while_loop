package while_loop;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args) 
	{	
		int n,i=2,count=0;
		System.out.println("Enter the number...");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		while(i<=n/2)
		{	
			if(n%i==0)
			{
				count=1;
				break;
			}
			if(count==0)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is non prime");
			}
			//i++;
		}
			}
}
