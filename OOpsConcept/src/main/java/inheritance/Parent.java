package inheritance;
public class Parent 
{
  static int a,b,mul=0;
  int sum=0;
  public static int product(int c,int d)
  {	  
	  mul=c*d;
	  System.out.println("Product:"+mul);
	  return mul;  
  }
  public Parent()
  {
	  System.out.println("Parent class Constructor");
  }
  public int add(int a,int b)
  {
	  this.a=a;
	  this.b=b;
	  sum=a+b;
	  System.out.println("SUM:"+sum);
	  return sum;
  }
}
