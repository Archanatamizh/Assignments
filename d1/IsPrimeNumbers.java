package wk1.d1;

public class IsPrimeNumbers {
	public static void main(String[] args) 
	{
		int n=10;
		boolean prime=true;
		for(int i=2;i<=n-1;i++)
		{
			
			if(n%i==0)
			{prime=false;
				System.out.println(n+"is a Prime Number");
			}
			else {
				System.out.println(n+"is not a Prime Number");
			}
		}
		
	}

}
