package com.codeblock.furywars;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.codeblock.furywars.graphics.Assets;
import com.codeblock.furywars.screens.LogoScreen;

public class FuryWars extends Game {
	public SpriteBatch batch;
	public Assets assets;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		assets = new Assets();
		setScreen(new LogoScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
