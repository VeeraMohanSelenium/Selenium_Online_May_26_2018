package oops;

public class Overloading {

	//Constructor Over loading
	public Overloading()
	{
		
	}
	public Overloading(int a)
	{
		
	}
	
	public Overloading(int c,int d)
	{
		
	}
	
	public void car()
	{
		
	}
	
	public void car(String brand,int c,boolean status)
	{
		System.out.println("My Car is::"+brand+" "+c+" "+status);
	}
	public void car(int f)
	{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ov=new Overloading();
		ov.car("Audi", 2, true);
		ov.car();
		ov.car(15);

	}

}
