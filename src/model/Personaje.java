package model;

public abstract class Personaje {
	
	protected int pPosx;
	protected int pPosy;
	protected int velX;
	protected int velY;
	
	
	public Personaje (int pPosx, int pPosy) {
		
		this.pPosx = pPosx;
		this.pPosy = pPosy;
		velX = 30;
		velY = 3;
		
	}
	
	public void moverP() {
	
	}

	public int getpPosx() {
		return pPosx;
	}

	public void setpPosx(int pPosx) {
		this.pPosx = pPosx;
	}

	public int getpPosy() {
		return pPosy;
	}

	public void setpPosy(int pPosy) {
		this.pPosy = pPosy;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	
	

}
