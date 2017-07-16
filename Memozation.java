import java.util.*;
class Memozation 
{
	public static void main(String[] args) 
	{			
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a value for n");
		int n = s.nextInt();
		int[] memo = new int[n] ;

		Arrays.fill(memo,-1);

		for(int i=0; i<n;i++)
		{
			System.out.print(fib(i,memo) + " ");
		}
	}


  
	public static int fib(int n, int[] memo)
		{	
			int res;
			if(n==0)

			{
				return (res =0);
			}
			
			if (n==1)
			{ return(res= 1); } 
			

			if(Arrays.asList(memo).contains(n)) // this statement never works so no memoization happens in this program
			{ 		
				return memo[n]; 	
			}
			
			

			else
			{
				res= (fib(n-1, memo) + fib(n-2, memo)); 
			}
			
			memo[n] = res;

			return res;
		}
}
