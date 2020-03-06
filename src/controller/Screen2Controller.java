package controller;

import java.util.ArrayList;

import model.Spaceinvaders;
import processing.core.PApplet;

public class Screen2Controller {

	private Spaceinvaders spaceInvaders;
	private PApplet app;

	public Screen2Controller(PApplet app) {

		this.app = app;
		spaceInvaders = new Spaceinvaders(app);

	}

	public void infoDirecHeroeView(int i) {
		spaceInvaders.inforDirecHeroeModel(i);
	}

	public void crearProyectilController() {
		spaceInvaders.crearProyectilModel();
	}

	public int infoPosxHeroeController() {
		return spaceInvaders.infoPosXheroe();

	}

	public void moverEnemigos() {
		spaceInvaders.recorrerEnemigosModel();
	}

	public void moverProyectiles() {
		spaceInvaders.recorrerProyectiles();
	}

	public  ArrayList<Integer> infoPosiXEnemigos() {

		return spaceInvaders.posicionesXEnemigos();
	}

	public  ArrayList<Integer> infoPosiYEnemigos() {
		return spaceInvaders.posicionesYEnemigos();
	}
	
	public ArrayList<Integer> posXproyectilContro() {

		return spaceInvaders.posicionesXproyectil();
	}

	public ArrayList<Integer> posYproyectilContro() {

		return spaceInvaders.posicionesYproyectil();
	}
	public void impactoController() {
		spaceInvaders.validarImpacto();
	}

	public int numeroVidasHeroe() {
		// TODO Auto-generated method stub
		return spaceInvaders.vidasHeoreModel();
	}

	
	
	public int numeroEnemiContro() {
		// TODO Auto-generated method stub
		return spaceInvaders.numeroEnemiModel();
	}
	
	

}
