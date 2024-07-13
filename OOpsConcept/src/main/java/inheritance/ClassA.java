package inheritance;
public class ClassA extends Parent
{
	public ClassA()
	{
		System.out.println("Child ClassA Constructor");
	}
	public static void show()
	{
		System.out.println("Child ClassA Static Method");
	}
	public static void main(String[] args) 
	{
		ClassA obj=new ClassA();
		Parent.product(10,11);
		obj.add(5,6);
	}
}
