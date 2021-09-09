package Pages;

public class Practice {
	
	public Practice()
	{
		System.out.println("This is costructor");
	}
	
	public Practice( String a, String b)
	{
		String c=a+b;
		System.out.println(c);
	}
	
	
//
//	int Roll =16;
//	String name= "Govind";
//	
//	public void display()
//	
//	{
//		//System.out.println("Roll numner is: " +Roll + " and "+ "Name is: " +name);
//		System.out.println(Roll + ":" + name);
//		
//		
//	}
	
	public static void main(String args[])
	{
//		Practice pr=new Practice();
//		pr.display();
		new Practice();
		new Practice("Tayee", "Bhavani");
		
	}
	
}
