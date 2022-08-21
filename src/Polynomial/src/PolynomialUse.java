
public class PolynomialUse
{
	public static void main(String[] args)
	{
		Polynomial p1=new Polynomial();
		p1.setcoefficient(5,2);
		p1.setcoefficient(3,4);
		Polynomial p2=new Polynomial();
		p2.setcoefficient(2,2);
		p2.setcoefficient(3,4);
		/*Polynomial ans=Polynomial.add(p1, p2);
		ans.print();*/
		/*Polynomial ans1=Polynomial.sub(p1,p2);
		ans1.print();*/
		Polynomial ans2=Polynomial.mul(p1,p2);
		ans2.print();
	}
}
