package implementation;
public class Group4 implements Group,Group1
{
 int sum,mul;
	public static void main(String[] args) 
	{
		Group4 obj=new Group4();
		obj.add();
		obj.mul();
	}
	public void add() 
	{
		sum=a+b;
		System.out.println("Sum:"+sum);		
	}
	public void mul()
	{
		mul=a*b;
		System.out.println("Product:"+mul);
	}
}
