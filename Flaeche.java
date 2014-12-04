public class Flaeche {
	double fleache;
	public Flaeche(int art,int part1,int part2,int part3){
		 
		switch(art){
		 
		 case 0:
			 fleacheQuadrat(fleache);
			 break;
		 case 1:
			 fleacheRechteck(fleache, fleache);
			 break;
		 case 2:
			 fleacheDreieck(fleache, fleache, fleache, fleache);
			 break;
		}
	}
	
	private void fleacheQuadrat(double a){
		fleache = a*a;
	}
	private void fleacheRechteck(double a, double b){
		fleache = a*b;
	}
	private void fleacheDreieck(double a,double b,double c,double h){
		fleache = (a+b+c)*2/h;
	}
	
	double getfleache(){
		return this.fleache;
	}
	private double setfleache(){
		return this.fleache;
	}
}