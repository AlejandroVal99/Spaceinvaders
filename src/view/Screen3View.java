package view;

import processing.core.PApplet;
import controller.Screen3Controller;

public class Screen3View {
	
	private PApplet app;
	private int screen;

	public Screen3View(PApplet app) {
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
		String texto = " Space Invaders";
		app.text(texto, 60, 90);

	}

	public void drawButton() {
 
		app.fill(150);
		app.rect(155, 370, 90, 40);
		app.textSize(15);
		app.fill(255, 0, 0);
		app.text("Play Again", 150, 395);

	}
	
	public void jugardeNuevo() {

		if (app.mouseX > 156 && app.mouseX < 245 && app.mouseY > 371 && app.mouseY < 408) {
			screen = 3;
			System.out.println("entre");
		}

	}
	
	public int getScreen(){
		return screen;
	}

}
