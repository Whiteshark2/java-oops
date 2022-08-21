public class Polynomial
{
	int data[];
	Polynomial()
	{
		data=new int[5];
	}
	public void setcoefficient(int degree,int coeff)
	{
		if(degree>data.length-1)
		{
			int temp[]=data;
			data=new int[degree+1];
			for(int i=0;i<temp.length;i++)
			{
				data[i]=temp[i];
			}
		}
		data[degree]=coeff;
	}
	public int getcoeff(int degree)
	{
		if(degree>data.length-1)
		{
			int temp[]=data;
			data=new int[degree+1];
			for(int i=0;i<temp.length;i++)
			{
				data[i]=temp[i];
			}
		}
		return data[degree];
	}
	public static Polynomial add(Polynomial p1,Polynomial p2)
	{
		int a=p1.data.length;
		int b=p2.data.length;
		Polynomial ans=new Polynomial();
		int len=Math.min(a, b);
		int i;
		for(i=0;i<len;i++)
		{
			ans.setcoefficient(i,p1.data[i]+p2.data[i]);
		}
		while(i<a)
		{
			ans.setcoefficient(i,p1.data[i]);
			i++;
		}
		while(i<b)
		{
			ans.setcoefficient(i,p2.data[i]);
			i++;
		}
		return ans;
	}
	public static Polynomial sub(Polynomial p1,Polynomial p2)
	{
		Polynomial ans1=new Polynomial();
		int a=p1.data.length;
		int b=p2.data.length;
		int len=Math.min(a,b);
		int i;
		for(i=0;i<len;i++)
		{
			ans1.setcoefficient(i,p1.data[i]-p2.data[i]);
		}
		while(i<a)
		{
			ans1.setcoefficient(i,p1.data[i]);
			i++;
		}
		while(i<b)
		{
			ans1.setcoefficient(i,-p2.data[i]);
			i++;
		}
		return ans1;
	}
	public static Polynomial mul(Polynomial p1,Polynomial p2)
	{
		Polynomial ans2=new Polynomial();
		for(int i=0;i<p1.data.length;i++)
		{
			for(int j=0;j<p2.data.length;j++)
			{
				int termdeg=i+j;
				int termcoeff=p1.data[i]*p2.data[j];
				int oldcoeff=ans2.getcoeff(termdeg);
				ans2.setcoefficient(termdeg,termdeg+oldcoeff);
			}
		}
		return ans2;
	}
	public void print()
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=0)
			System.out.print(data[i]+"x^"+i+"+");
		}
	}
}