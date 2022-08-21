
public class Triangle {
	float x,y,z;
	void areaAndperimeter()
	{
		float  s= (x+y+z)/2;
		float area = (float)Math.sqrt(s*(s-x)*(s-y)*(s-z));
		float peri = x+y+z;
		System.out.println("Area of Triangle = "+ area +"   "+"Perimeter of Triangle = "+peri);
	}
public static void main(String args[])
{
	Triangle t = new Triangle();
	t.x=10;
	t.y=20;
	t.z=11;
	t.areaAndperimeter();
}
}
