package model;

public class Enemigo extends Personaje {

	public Enemigo(int pPosx, int pPosy) {
		super(pPosx, pPosy);

	}
	
	public void moverP(){
		pPosx += velX;
		
		
		if(pPosx <= 10) {
		 	velX *=(-1);
			pPosy += 20;
			
		} 
		if(pPosx >= 390) {
			velX *=(-1);
			pPosy += 20;
			
		}
		
		if(pPosy >= 550) {
			pPosy = 40;
		}
		
	}

}
