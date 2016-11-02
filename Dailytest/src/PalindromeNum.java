import java.util.InputMismatchException;
import java.util.Scanner;
public class PalindromeNum  
{
	
	public static void main(String args[])
	{
		try{
		
		int n,rev;    //initalizing both rev and n    
		int t=0;     // initalizing t
		Scanner in=new Scanner(System.in);   // it creates object for the Scanner and takes input by user 
		System.out.println("enter number");  // printed at console 
		n=in.nextInt();        //
		int x=n;               //initalizing x=n
		
		
		while(n>0)
		{
			rev=n%10;     // it takes the coieficent of the number
			n=n/10;       // 
			t=t*10+rev;   // 
			
		}
		
		if(x==t)    // if the given number and the number we reversed is same it prints this
		{
			System.out.println("the number is a palindrome number");
		}
		else   //if the given number and the number we reversed is not same it prints this
		{
			System.out.println("the number is not a palindrome number");
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("it's not valid:" +e);
		}
		
		
		
		
		
		
	}

}
