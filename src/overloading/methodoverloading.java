package overloading;

public class methodoverloading {
	// method overloading is feature that allows a class to have more than one method have the same name
	
	void add (int a, int b)
	
	{System.out.println(a+b);}

	void add (int a, double b)
	
	{System.out.println(a+b);}

	void add (double a, double b)
	
	{System.out.println(a+b);}

	void add (int a, int b, int c)
	
	{System.out.println(a+b);}

	public static void main(String[] args) {

		methodoverloading mo=new methodoverloading();
		mo.add(10, 20);
		mo.add(10, 20.0);
		mo.add(1.3, 2.0);
		mo.add(10, 20,3);
	}

}
