package polymorphism;
public class MethodOverloading
{
	int a=5,b=6,Sum;
	float Add;
	String c;
	public void add()
	{
		Sum=a+b;
		System.out.println("Sum:"+Sum);
	}
	public int add(int a,int b)
	{
		Sum=a+b;
		System.out.println("Sum:"+Sum);
		return Sum;
	}
	public float add(float a,float b)
	{
		Add=a+b;
		System.out.println("Decimal Addition:"+Add);
		return Add;
	}
	public String add(String a,String b)
	{
		c=a.concat(b);
		System.out.println("Concatenated String:"+c);
		return c;
	}
}
