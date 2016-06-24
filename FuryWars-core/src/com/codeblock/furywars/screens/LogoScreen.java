package com.codeblock.furywars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.codeblock.furywars.FuryWars;

public class LogoScreen extends ScreenAdapter {
	FuryWars game;
	int a = 0;

	public LogoScreen (FuryWars game) {
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		GL20 gl = Gdx.gl;
		gl.glClearColor(1, 1, 1, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.begin();
		game.batch.draw(game.assets.logoScreen, Gdx.graphics.getWidth()/4, 0, Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight());
		game.batch.end();
		a++;
		if(a > 249){
			game.setScreen(new MainMenuScreen(game));
		}
	}
}

