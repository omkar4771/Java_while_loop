package while_loop;

public class palindrom {

	public static void main(String[] args) 
	{
	int n=121,n1,sum=0,p;
	p=n;
	while(n>0)
	{
		n1=n%10;
		n=n/10;
		
		sum=(sum*10)+n1;
		
	}
	if(p==sum)
	{
		System.out.println("The number is palindrome");
	}
	else
	{
		System.out.println("The number is not palindrome..!"+sum);
	}
	}

}
