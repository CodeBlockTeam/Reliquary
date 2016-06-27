package com.codeblock.furywars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
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
		playBounds = new Rectangle(-70, -95, 31, 47);
	}
	
	@Override
	public void render (float delta) {
		if(Gdx.input.justTouched()){
			guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
			
			if(playBounds.contains(touchPoint.x, touchPoint.y)){
				game.setScreen(new GameSelectorScreen(game));
				return;
			}
		}
		GL20 gl = Gdx.gl;
		gl.glClearColor(1, 1, 1, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.disableBlending();
		game.batch.begin();
		game.batch.draw(game.assets.titleBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		game.batch.end();
		
		game.batch.enableBlending();
		game.batch.begin();
		game.batch.draw(game.assets.pole, Gdx.graphics.getWidth()/2-175, Gdx.graphics.getHeight()/2-140, 8*2, 16*4);
		game.batch.draw(game.assets.sign, Gdx.graphics.getWidth()/2-220, Gdx.graphics.getHeight()/2-100, 100, 50);
		game.assets.font.setColor(Color.BLACK);
		game.assets.font.draw(game.batch, "Play", Gdx.graphics.getWidth()/2-185, Gdx.graphics.getHeight()/2-70);
		game.batch.end();
	}
}
