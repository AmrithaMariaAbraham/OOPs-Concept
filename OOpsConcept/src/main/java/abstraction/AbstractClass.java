package abstraction;
public abstract class AbstractClass 
{
	public void display()
	{
		System.out.println("Instance Method of Abstract class");
	}
	public AbstractClass()
	{
		System.out.println("Abstract Class Constructor");
	}
	public static void show()
	{
		System.out.println("Abstract class Static Method");
	}
	public abstract void add();
}
