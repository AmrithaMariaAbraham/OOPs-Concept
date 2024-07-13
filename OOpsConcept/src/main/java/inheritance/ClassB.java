package inheritance;
public class ClassB extends ClassA 
{
	public ClassB()
	{
		System.out.println("ClassB constructor");
	}
	public static void main(String[] args) 
	{
		ClassB obj=new ClassB();
		obj.add(10, 12);
		ClassA.show();
	}
}
