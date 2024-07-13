package implementation;
public class Group2 implements Group1 
{
	public static void main(String[] args) 
	{
		Group2 obj=new Group2();
		obj.add();
		obj.mul();
	}

	public void add() 
	{
		System.out.println("A:"+a+",B:"+b+",Sum"+(a+b));		
	}
	public void mul() 
	{
		System.out.println("A:"+a+",B:"+b+",Product"+(a*b));
	}
}
