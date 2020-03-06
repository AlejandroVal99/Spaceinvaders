package view;

import processing.core.PApplet;


public class Screen1View {

	private PApplet app;
	private int screen;


	public Screen1View(PApplet app) {

		this.app = app;

	}

	public void drawScreen() {
		app.background(0);
		drawText();
		drawButton();

	}

	public void drawText() {

		app.textSize(42);
		app.fill(255, 0, 0);
		app.textLeading(35);
		String texto = " Bienvenido a\n" + " Space-Invader";
		app.text(texto, 60, 90);

	}

	public void drawButton() {

	 	app.fill(150);
		app.rect(155, 370, 90, 40);
		app.textSize(20);
		app.fill(255, 0, 0);
		app.text("Play", 180, 395);

	}

	public void startTheGame() {

		if (app.mouseX > 156 && app.mouseX < 245 && app.mouseY > 371 && app.mouseY < 408) {
			screen = 2;
			System.out.println("entre");
		}

	}
	
	public int getScreen(){
		return screen;
	}

}
