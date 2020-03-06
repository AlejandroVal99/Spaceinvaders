package view;

import processing.core.PApplet;

public class MainView extends PApplet {

	private int screen = 1;
	private Screen1View startView;
	private Screen2View playView;
	private Screen3View resultView;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");
	}

	public void settings() {
		size(400, 600);

	}

	public void setup() {

		startView = new Screen1View(this);
		playView = new Screen2View(this);
		resultView = new Screen3View(this);

	}

	public void draw() {
		// rectMode(CENTER);
		// background(0);
		

	 	switch (screen) {

		case 1:

			startView.drawScreen();
			

			break;
		case 2:
			
			playView.drawScreen();
			
			if(playView.numeroVidas()<=0) {
				screen = 3;
			}
			if(playView.numeroEnemigos()==0) {
				screen = 3;
			}
			//setScreen(playView.getScreen());
			

			break;

		case 3:

			resultView.drawScreen();

			break;
		}

	}

	public void mousePressed() {
		//println(mouseX + " Y " + mouseY);
		switch (screen) {

		case 1:

			startView.startTheGame();
			setScreen(startView.getScreen());
			

			break;
		case 2:
			
			
			
			break;

		case 3:
			
			startView.startTheGame();
			setScreen(resultView.getScreen());

			break;
		}

	}

	public void keyPressed() {
		
		switch (screen) {

		case 2:
			playView.moverHeroeScreen2View();
			playView.dispararProyectilView();
			break;

		}
		
	}
	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

}