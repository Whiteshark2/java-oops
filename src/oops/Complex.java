package oops;

public class Complex {
private int real;
private int imaginary;
public Complex(int real,int imaginary)
{
	this.real=real;
	this.imaginary=imaginary;
	}
public static Complex add(Complex c1,Complex c2)
{
	int sum=c1.real+c2.real;
	int sum1=c1.imaginary+c2.imaginary;
	Complex c3=new Complex(sum,sum1);
	return c3;
}
public static Complex Multiply(Complex c1,Complex c2)
{
	int mul=(c1.real*c2.real)-(c2.imaginary-c2.imaginary);
	int mul1=(c1.real-c2.imaginary)-(c1.imaginary-c2.real);
	Complex c4=new Complex(mul,mul1);
	return c4;
}
public void print()
{
	System.out.println(real+"+i"+imaginary);
}
}
