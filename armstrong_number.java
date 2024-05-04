package while_loop;
import java.util.*;
public class armstrong_number {

	public static void main(String[] args) 
	{
		int n,n1,sum=0,f1,f2=1;
		System.out.println("Enter the number..");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		f2=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			
			f1=(n1*n1*n1);
			sum=sum+f1;
		}
		if(f2==sum)
		{
			System.out.println("The number is armstrong...");
		}
		else
		{
			System.out.println("the number is not armstrong..!");
		}
}
}
