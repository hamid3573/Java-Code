package thiskeyword;

public class thiskeyword1 {
	
		int a,b; // instance variable

		void getValues (int a, int b) // method variable
		{
			this.a=a;
			this.b=b;
		}
          void printValues()
          {
        	  System.out.println(a);
        	  System.out.println(b);
        	  
          }
		public static void main(String[] args) {
			
			thiskeyword1 th= new thiskeyword1();
			th.getValues(10,200);
			th.printValues();
			
			//keyword "THIS" is a reference variable in java that refers to current object
		}

		

}




