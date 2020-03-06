package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Spaceinvaders {

	private PApplet app;
	private Heroe heroe;
	
	private ArrayList<Integer> posXene;
	private ArrayList<Integer> posYene;

	//private Enemigo[] enemigos;

	private ArrayList<Enemigo> enemigos;
	private ArrayList<Integer> posXPro;
	private ArrayList<Integer> posYPro;

	public Spaceinvaders(PApplet app) {
		this.app = app;
		heroe = new Heroe(app.width / 2 - 20, 550);
		enemigos = new ArrayList<Enemigo>();
		posXene = new ArrayList<Integer>();
		posYene = new ArrayList<Integer>();

		posXPro = new ArrayList<Integer>();
		posYPro = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {

			enemigos.add(new Enemigo(60 * (i + 1), 50));

			// System.out.println("X " + enemigos[i].getpPosx());
			// System.out.println("Y " + enemigos[i].getpPosy());

		}

	}

	public void inforDirecHeroeModel(int i) {
		heroe.moverP(i);
	}

	public int infoPosXheroe() {

		return heroe.getpPosx();

	}

	public void recorrerEnemigosModel() {

		for (int i = 0; i < enemigos.size(); i++) {

			if (enemigos.get(i) != null) {
				enemigos.get(i).moverP();

				// posXenemigo = enemigos[i].getpPosx();
				// posYenemigo = enemigos[i].getpPosy();

				posXene.add(enemigos.get(i).getpPosx());
				posYene.add(enemigos.get(i).getpPosy());

				// System.out.println(posXenemigo);
				// System.out.println(posYenemigo);
				// infoXEnemigoModel();
				// infoYEnemigoModel();
			}
		}
	}

	public ArrayList<Integer> posicionesXEnemigos() {
		return posXene;
	}

	public ArrayList<Integer> posicionesYEnemigos() {
		return posYene;
	}

	public void recorrerProyectiles() {
		for (int i = 0; i < heroe.getProyectiles().size(); i++) {

			if (heroe.getProyectiles().get(i) != null) {

				heroe.getProyectiles().get(i).moverPr();

				posXPro.add(heroe.getProyectiles().get(i).getPrPosx());
				// System.out.println(heroe.getProyectiles().get(i).getPrPosx());
				posYPro.add(heroe.getProyectiles().get(i).getPrPosy());

			}

		}
	}

	public ArrayList<Integer> posicionesXproyectil() {

		return posXPro;
	}

	public ArrayList<Integer> posicionesYproyectil() {

		return posYPro;
	}

	public void crearProyectilModel() {
		heroe.crearProyectil();
	}

	public void validarImpacto() {
		for (int i = 0; i < heroe.getProyectiles().size(); i++) {
			for (int j = 0; j < enemigos.size(); j++) {

				if (heroe.getProyectiles().size()>0  && enemigos.size() > 0) {

					if (app.dist(heroe.getProyectiles().get(i).getPrPosx(), heroe.getProyectiles().get(i).getPrPosy(),
							enemigos.get(j).getpPosx(), enemigos.get(j).getpPosy()) < 30) {

						heroe.getProyectiles().remove(i);
						enemigos.remove(j);
						//posXpro.remove(i);

					}

				}

			}

		}
	}

	public int vidasHeoreModel() {
	
		if(((app.frameCount %= 40) == 0)&& enemigos.size()>0) {
			
			if(enemigos.get(1).getpPosy() >= 510) {
				heroe.setVidas(1);
			}
			
		}
		
		
	return heroe.getVidas();
	}
	
	
	public int numeroEnemiModel() {
		// TODO Auto-generated method stub
		return enemigos.size();
	}
	
	
		
		
	
	
	

}
