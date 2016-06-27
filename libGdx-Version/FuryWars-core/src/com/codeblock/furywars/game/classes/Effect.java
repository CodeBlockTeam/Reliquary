package com.codeblock.furywars.game.classes;

import com.codeblock.furywars.game.interfaces.EffectInterface;

public class Effect implements EffectInterface {
	String name;
	
	public Effect(String name){
		this.name = name;
	}

	@Override
	public void use(Entity e) {}
}
