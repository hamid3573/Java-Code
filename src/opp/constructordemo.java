package opp;

public class constructordemo {
	
	
	int x;
	int y;
	constructordemo()
	{x=10;y=20;}
	void display ()
	{System.out.println(x+y);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructordemo cm1=new constructordemo();
		cm1.display();
	}

}
