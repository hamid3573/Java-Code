package string;

public class string_comparing_equals {

	public static void main(String[] args) {
		
		String s="welcome";
		
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("wel come"));
		System.out.println(s.equals("wel co me"));
		
		System.out.println(s.equalsIgnoreCase("Welcome"));

	}

}
