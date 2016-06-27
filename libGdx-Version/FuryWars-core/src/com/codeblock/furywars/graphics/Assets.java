package com.codeblock.furywars.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Assets {
	public Texture logoScreen;
	public Texture button;
	public Texture pole;
	public Texture sign;
	public Texture titleBackground;
	
	public BitmapFont font;
	
	public Assets(){
		logoScreen = new Texture("logoScreen.png");
		button = new Texture("butt-on.png"); //Had to!
		titleBackground = new Texture("titleBackground.png");
		pole = new Texture("pole.png");
		sign = new Texture("sign.png");
		
		font = new BitmapFont();
	}
}
