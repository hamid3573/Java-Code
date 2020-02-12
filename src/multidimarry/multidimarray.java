package multidimarry;

public class multidimarray {

	public static void main(String[] args) {


		int a [][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println("number of rows:" + a.length);
		System.out.println("number of colums:" + a[0].length);
		
		for (int i=0; i<a[i].length;i++) // 0123456
		{
			for (int x=0;x<a[i].length;x++)///01
			{
				System.out.println(a[i][x]);
			}
		}
		

	}
	
}
