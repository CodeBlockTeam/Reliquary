package com.codeblock.furywars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.codeblock.furywars.FuryWars;

public class MainMenuScreen extends ScreenAdapter {
	FuryWars game;
	OrthographicCamera guiCam;
	Vector3 touchPoint;
	Rectangle playBounds;

	public MainMenuScreen (FuryWars game) {
		this.game = game;
		guiCam = new OrthographicCamera(320, 480);
		touchPoint = new Vector3();
		playBounds = new Rectangle(0-50, 0-25, 100, 25);
	}
	
	@Override
	public void render (float delta) {
		if(Gdx.input.justTouched()){
			guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
			
			if(playBounds.contains(touchPoint.x, touchPoint.y)){
				System.out.println("Yes");
				return;
			}
		}
		GL20 gl = Gdx.gl;
		gl.glClearColor(1, 1, 1, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.begin();
		game.batch.draw(game.assets.playBtn, Gdx.graphics.getWidth()/2-50, Gdx.graphics.getHeight()/2-25, 100, 50);
		game.batch.end();
	}
}
