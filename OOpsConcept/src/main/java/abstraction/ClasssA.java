package abstraction;
public class ClasssA extends AbstractClass 
{
	int a,b,sum=0;
	public static void main(String[] args)
	{
		ClasssA obj=new ClasssA();
		obj.display();
		AbstractClass.show();
    }
	@Override
	public void add() 
	{
		sum=a+b;
		System.out.println("Sum:"+sum);		
	}
}
