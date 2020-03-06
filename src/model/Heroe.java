package model;

import java.util.ArrayList;

public class Heroe extends Personaje {


	private int vidas;
	private ArrayList<Proyectil> proyectiles;

	public Heroe(int pPosx, int pPosy) {
		super(pPosx, pPosy);
		vidas = 3;
		proyectiles = new ArrayList<Proyectil>();

	}

	public int getVidas() {
		return vidas;
	} 

	public void setVidas(int vidas) {
		vidas = 1;
		this.vidas -= vidas;
	}

	public void moverP(int direccion) {

		if (direccion == 1) {
			pPosx -= 3;
		}
		if (direccion == 0) {
			pPosx += 3;
		}
	}

	public void crearProyectil() {
		proyectiles.add(new Proyectil(pPosx + 25, 550)) ;
		System.out.println(pPosy);
	}

	public ArrayList<Proyectil> getProyectiles() {
		return proyectiles;
	}

	public void setProyectiles(ArrayList<Proyectil> proyectiles) {
		this.proyectiles = proyectiles;
	}

	

};