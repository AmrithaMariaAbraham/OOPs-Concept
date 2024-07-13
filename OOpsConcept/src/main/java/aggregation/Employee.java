package aggregation;
public class Employee
{
	String name;
	int id;
	Address address;
	public void employee(String name,int id,Address address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public void displaydetails()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) 
	{
	  Address adj=new Address("TVM","Kerala","India");
	  Employee emp=new Employee();
	  emp.employee("Amritha",101,adj);
	  emp.displaydetails();
	 }
}
