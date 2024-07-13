package polymorphism;
public class ClassA extends MethodOverloading
{
	public static void main(String[] args) 
	{
	  ClassA obj=new ClassA();
	  obj.add();
	  obj.add(11,12);
	  obj.add(12.4f,13.8f);
	  obj.add("James","Gosling");
	}
}
