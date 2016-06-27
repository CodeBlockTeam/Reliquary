package com.codeblock.furywars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.codeblock.furywars.FuryWars;

public class GameSelectorScreen extends ScreenAdapter {
	FuryWars game;
	OrthographicCamera guiCam;
	Vector3 touchPoint;
	
	Rectangle backBounds;
	Rectangle saveOneBounds;
	Rectangle saveTwoBounds;
	Rectangle saveThreeBounds;

	public GameSelectorScreen (FuryWars game) {
		this.game = game;
		guiCam = new OrthographicCamera(320, 480);
		touchPoint = new Vector3();
		
		//Fix Save Bounds
		saveOneBounds = new Rectangle(0-78, 0+95, 156, 47);
		saveTwoBounds = new Rectangle(0-78, 0, 156, 47);
		saveThreeBounds = new Rectangle(0-78, 0-96, 156, 47);
		backBounds = new Rectangle(-156, -230, 30, 47);
	}
	
	@Override
	public void render (float delta) {
		if(Gdx.input.justTouched()){
			guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
			
			if(backBounds.contains(touchPoint.x, touchPoint.y)){
				game.setScreen(new MainMenuScreen(game));
				return;
			}
			if(saveOneBounds.contains(touchPoint.x, touchPoint.y)){
				return;
			}
			if(saveTwoBounds.contains(touchPoint.x, touchPoint.y)){
				return;
			}
			if(saveThreeBounds.contains(touchPoint.x, touchPoint.y)){
				return;
			}
		}
		GL20 gl = Gdx.gl;
		gl.glClearColor(1, 1, 1, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.begin();
		game.batch.draw(game.assets.button, Gdx.graphics.getWidth()/2-250, Gdx.graphics.getHeight()/2+100, 500, 50);
		game.batch.draw(game.assets.button, Gdx.graphics.getWidth()/2-250, Gdx.graphics.getHeight()/2, 500, 50);
		game.batch.draw(game.assets.button, Gdx.graphics.getWidth()/2-250, Gdx.graphics.getHeight()/2-100, 500, 50);
		game.batch.draw(game.assets.button, 10, 10, 100, 50);
		
		game.assets.font.setColor(Color.BLACK);
		game.assets.font.draw(game.batch, "Back", 40, 40);
		game.assets.font.draw(game.batch, "Select Save", Gdx.graphics.getWidth()/2-30, Gdx.graphics.getHeight()-30);
		game.assets.font.draw(game.batch, "Create Save", Gdx.graphics.getWidth()/2-30, Gdx.graphics.getHeight()/2+135);
		game.assets.font.draw(game.batch, "Create Save", Gdx.graphics.getWidth()/2-30, Gdx.graphics.getHeight()/2+35);
		game.assets.font.draw(game.batch, "Create Save", Gdx.graphics.getWidth()/2-30, Gdx.graphics.getHeight()/2-65);
		game.batch.end();
	}

}
