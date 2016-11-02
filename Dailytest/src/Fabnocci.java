
public class Fabnocci {
	
	
	public static void main(String args[])
	{
		int a,b,c;      // initializing
		a=0;
		b=1;
		
	System.out.println(a);    // printing a value
	System.out.println(b);    //printing b value
	c=a+b;
	System.out.println(c);    //printing c value
		
		
		while(c<100)
		{
			
			a=b;              //initalizing b value to a
			b=c;              //initalizing c value to b
			c=a+b;
			
			System.out.println(c);  // printing the result
			
		}
		
		
	}

}
