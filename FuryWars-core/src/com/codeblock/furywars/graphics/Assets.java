package com.codeblock.furywars.graphics;

import com.badlogic.gdx.graphics.Texture;

public class Assets {
	public Texture player;
	public Texture fireblast;
	public Texture forground;
	public Texture logoScreen;
	public Texture mainMenuScreen;
	
	public Assets(){
		player = new Texture("Player.png");
		fireblast = new Texture("fireblast.png");
		forground = new Texture("forground.png");
		logoScreen = new Texture("logoScreen.png");
		mainMenuScreen = new Texture("mainMenuScreen.png");
	}
}
