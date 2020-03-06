package model;

public class Proyectil {
	
	private int prPosx;
	
	
	public Proyectil (int prPosx,int prPosy) {
		this.prPosx = prPosx; 
		this.prPosy = prPosy;
		//prVely = 5;
	}
	
	public void moverPr() {
		prPosy -= 2 ;
		System.out.println(prPosy);
	}
	
	
	
	public int getPrPosx() {
		return prPosx;
	}
	
	public void setPrPosx(int prPosx) {
		this.prPosx = prPosx;
	}
	
	public int getPrPosy() {
		return prPosy;
	}
	
	public void setPrPosy(int prPosy) {
		this.prPosy = prPosy;
	}
	
	public int getPrVely() {
		return prVely;
	}
	
	public void setPrVely(int prVely) {
		this.prVely = prVely;
	}
	
	private int prPosy;
	private int prVely;
}
