package Array;


public class Primeno {


	public boolean checkprime(int a)
	{
		boolean b=true;
		int c;
		c=a/2;
		if(a==1)
		{
			b=false;
		}
		else
		for(int i=2;i<=c;i++)
		{
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
	
	public void listprimeno(int a)
	{
		boolean b;
		int c;
		for(int i=2;i<=a;i++)
		{
		     /*c=i/2;
		     b=true;
			for(int j=2;j<=c;j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}*/
	         if(checkprime(i))
	       {
	    	System.out.println(i);
	       }
	 
	   }
			

	}
	public void listPrimes(int size)
	{
		 int k=0;
		 boolean f;
		for(int i=1;k<size;i++)
		{   
			f=true;
			
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=false;
					break;
				}
					
			}
			if(f==true) {
				System.out.println(i);
				k++;
			}
		}
	}
}





