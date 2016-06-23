package com.codeblock.furywars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.codeblock.furywars.FuryWars;

public class MainMenuScreen extends ScreenAdapter {
	FuryWars game;

	public MainMenuScreen (FuryWars game) {
		this.game = game;
	}
	
	@Override
	public void render (float delta) {
		GL20 gl = Gdx.gl;
		gl.glClearColor(1, 0, 0, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.begin();
		game.batch.draw(game.assets.mainMenuScreen, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		game.batch.end();	
	}
}
