import javax.*;
public class Testklasse {
	public static void main (String []args){
		System.out.println("Flaechenberechnung");
		
		Flaeche f1= new Flaeche(0,1,2,3);
			System.out.println(f1.getfleache());
		
		
		Flaeche f2= new Flaeche(1,1,2,3);
			System.out.println(f2.getfleache());
		
		
		Flaeche f3= new Flaeche(2,1,2,3);
			System.out.println(f3.getfleache());
		
		
		System.out.println("Rauminhalte")	;
		
		Rauminhalt r1 = new Rauminhalt(1,2,3,0);
			System.out.println(r1.getInhalt());

		Rauminhalt r2 = new Rauminhalt(1,2,3,1);
			System.out.println(r2.getInhalt());
		
		Rauminhalt r3 = new Rauminhalt(1,2,3,2);
			System.out.println(r3.getInhalt());
		
		System.out.println("Berechnung von Zahlen");
		
		//Array Index out of bounds fehler.
		Maximum m1 = new Maximum(1,2,3,4,5);
			System.out.println(m1.getSum());
			System.out.println(m1.getMax());
			System.out.println(m1.getMin());
			
		
			



	}

	
}
	


