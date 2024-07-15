package implementation;
public class Group2 implements Group1 
{
	int sum,prod;
	public static void main(String[] args) 
	{
		Group2 obj=new Group2();
		obj.add();
		obj.mul();
	}

	public void add() 
	{
		sum=a+b;
		System.out.println("A:"+a+",B:"+b+",Sum:"+sum);		
	}
	public void mul() 
	{
		prod=a*b;
		System.out.println("A:"+a+",B:"+b+",Product:"+prod);
	}
}
