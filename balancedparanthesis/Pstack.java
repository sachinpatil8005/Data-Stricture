package balancedparanthesis;

public class Pstack {
     private String pstack="";
     private String input;
     int top;
	public Pstack(String input) {
		this.input = input;
		top=-1;
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(top==(input.length()-1))
			return true;
		else
			return false;
	}
	public void push(char c)
	{
		if(!isFull())
		{
			pstack+=c;
		    top++;
		}   
		else
			System.out.println("stack is full");
	}
	public char pop()
	{
		char c='n';
		if(!isEmpty())
			return pstack.charAt(top--);
		else
		     return c;
	}
	public char peek()
	{
		
		if(!isEmpty())
		return pstack.charAt(top);
		else
		return 'n';
	}
	char c;
	char d;
	public boolean balenced()
	{
		for(int i=0;i<input.length();i++)
		{
			c=input.charAt(i);
			if(c=='(' || c=='{' || c=='[')
			{ 
				push(c);
			}
			  
			else
			{
				if(isEmpty())
				{
					return false;
				}
				d=pop();
			    if(d=='(' && c==')')
			    {
			         continue; 
			    }
			    else if(d=='[' && c==']')
			    {	
			    	continue;
			    }
			    else if(d=='{' && c=='}')
			    {
			    	continue;
			    }
			    else {
					return false;
				}
			}
		}	
	
		if(isEmpty())
		{
			return true;
		}
		else 
			return false;
     
     
	}
}
