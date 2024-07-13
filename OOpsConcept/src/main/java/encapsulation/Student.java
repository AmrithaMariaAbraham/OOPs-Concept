package encapsulation;
public class Student 
{
private int id;
private String name;
public void setter(int id,String name)
{
	this.id=id;
	this.name=name;
}
public void getter()
{
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
}
}
