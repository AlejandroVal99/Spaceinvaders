package view;

import processing.core.PApplet;
import controller.Screen2Controller;
import javafx.scene.shape.Ellipse;

public class Screen2View {

	private PApplet app;
	private Screen2Controller screen2Controller;
	private Ellipse circulo;
	int screen;
	

	public Screen2View(PApplet app) {
		this.app = app;

		screen2Controller = new Screen2Controller(app);

	}

	public void drawScreen() {
		app.background(0);
		pintarHeroeView();
		pintarEnemigosXYView();
		pintarProyectiles();
		impactoView();
		numeroVidas();
		numeroEnemigos();
		validarScreen3();

	}

	public void moverHeroeScreen2View() {

		// DERECHA
		if (app.keyCode == app.RIGHT) {

			screen2Controller.infoDirecHeroeView(0);
		}
		// IZQUIERDA
		if (app.keyCode == app.LEFT) {

			screen2Controller.infoDirecHeroeView(1);
		}

	}

	public void dispararProyectilView() {

		if (app.key == ' ') {

			System.out.println("nuevo royectil");
			screen2Controller.crearProyectilController();
		}
	}

	public void pintarHeroeView() {
		app.fill(250);
		app.rect(screen2Controller.infoPosxHeroeController(), 540, 50, 30);
	}

	public void pintarEnemigosXYView() {

		screen2Controller.moverEnemigos();

		for (int i = 0; i < screen2Controller.infoPosiXEnemigos().size(); i++) {

			app.fill(250);
			app.ellipse(screen2Controller.infoPosiXEnemigos().get(i), screen2Controller.infoPosiYEnemigos().get(i), 30, 30);

		}

	}

	public void pintarProyectiles() {
		
		screen2Controller.moverProyectiles();
		
		for (int i = 0; i < screen2Controller.posYproyectilContro().size(); i++) {

			app.fill(250, 0, 0);
			app.ellipse(screen2Controller.posXproyectilContro().get(i), screen2Controller.posYproyectilContro().get(i),
					5, 5);
		}

	}
	
	public void impactoView() {
		screen2Controller.impactoController();
	}
	
	public int numeroVidas() {
		app.fill(255,0,0);
		app.text("Vidas:"+ screen2Controller.numeroVidasHeroe(), 30, 590);
		
		return screen2Controller.numeroVidasHeroe();
	}
	
	public int numeroEnemigos() {
		app.fill(255,0,0);
		app.text("Enemigos:"+ screen2Controller.numeroEnemiContro(), 260, 590);
		return screen2Controller.numeroEnemiContro();
		}
	
	
	public void validarScreen3() {
		
		if(screen2Controller.numeroEnemiContro()==0) {
			screen = 3;
			
		}
		if(screen2Controller.numeroVidasHeroe()==0) {
			
			screen = 3;
			
		}
	}
	
	
	
	public int getScreen() {
		return screen;
	}

	
	
	
	

}
