package exception_Demo;

public class Exception1 {

	public static void main(String[] args) {
		try {
			Divide(10,3);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());		
		
	}
		finally {
		System.out.println("Hello");
	}
		System.out.println("Help");
	}
	public static int Divide(int a,int b) throws DividebyZeroException
	{
		if(b==0)
		{
			throw new DividebyZeroException();
		}
		return (a/b);
	}
	public static int fact(int n) throws NegativeNumberException
	{
		if(n<0)
		{
			throw new NegativeNumberException();
		}
		int ans =1;
		for(int i =2;i<=n;i++)
		{
			ans = ans*i;
		}
		return ans;
	}

}
