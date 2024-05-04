package while_loop;

import java.util.Scanner;

public class multitable 
{

	public static void main(String[] args) 
	{	
		int n,f1=1,i=1,f;
		System.out.println("Enter the number...");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		while(i<=10)
		{	f=i;
			f1=i*n;
			i++;
			
			System.out.println(f+" * "+n+" = "+f1);
		}
	}

}
