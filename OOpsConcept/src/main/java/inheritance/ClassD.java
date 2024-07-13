package inheritance;
public class ClassD extends ClassB 
{
	public static void main(String[] args) 
	{
		ClassD obj=new ClassD();
		obj.add(5,6);
		ClassB.product(2,3);
		ClassB.show();
		Parent.product(3,5);
	}
}
