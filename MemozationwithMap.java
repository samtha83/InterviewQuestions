import java.util.*;
class MemozationwithMap
{
	public static void main(String[] args) 
	{			
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a value for n");
		int n = s.nextInt();
		HashMap ht = new HashMap();


		for(int i=0; i<n;i++)
		{
			
			System.out.print(fib(i,ht) + " ");
			
		}
	}


  
	public static long fib(int n, HashMap ht)
		{	
			long res;
			if(n==0)
			{ return (res =0); 	}
			
			if (n==1)
			{ return(res= 1); } 
			

			if(ht.containsKey(n))
			{ 		
				Object vobj = ht.get(n); 	
				Long io = (Long)vobj;
				long ans = io.longValue();

				return ans;
			}
			
			
			else
			{
				res= (fib(n-1, ht) + fib(n-2, ht)); 
			}
			
			ht.put(n,res);
			return res;
		}
}
