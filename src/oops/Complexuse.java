package oops;

public class Complexuse {
	public static void main(String args[])
	{
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(2,3);
		Complex c3=Complex.add(c1, c2);
		Complex c4=Complex.Multiply(c1, c2);
		c4.print();
		c3.print();
	}

}
