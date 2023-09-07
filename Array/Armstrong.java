package Array;

public class Armstrong {
	
	
	public void armstrong(int a)
	{
		for(int i=1;i<=a;i++)
		{
			int temp=0;
			int b;
			int sum=0;
			int cn;
			 b=i;
			 cn=count(b);
			while(b>0)
			{
			   temp = b%10;
			   sum=sum+power(temp,cn);
			   b=b/10;				
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}
		
	}
	
	
	public int power(int base,int power)
	{
	   int a=1;
	   for(int i=0;i<power;i++)
	   {
		  a=a*base; 
	   }
	   return a;
		
	}
	
	public int count(int a)
	{
	   int cn=0;
	   while(a>0)
	   {
		   cn++;
		   a=a/10;
	   }
	   return cn;
	   
	}

}
