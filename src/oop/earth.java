package oop;

public class earth {

	public static void main(String[] args) {
	
		Human abobakar;
		
		abobakar = new Human();
		
		abobakar.lastname="safi";
		abobakar.age=7;
		abobakar.weightinkg=43.50;
		abobakar.reilgion="islam";
		abobakar.gender="male";
		abobakar.eyeColor="black";
		abobakar.weightScale= "KG";
		abobakar.display();
		
        Human Omar;
        Omar = new Human();
        
       Omar.lastname = "Bawar";
       Omar.age=3;
       Omar.weightinkg=30.50;
       Omar.reilgion="islam";
       Omar.gender="male";
       Omar.eyeColor="blu";
       Omar.weightScale= "KG";
       Omar.display();
	}

}
