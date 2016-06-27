package com.codeblock.furywars.game.classes;

import java.util.ArrayList;

public class Spell {
	String name;
	
	ArrayList<Effect> effectList;
	
	public Spell(String name, ArrayList<Effect> effectList){
		this.name = name;
		this.effectList = effectList;
	}
	
	public void use(Entity entity){
		for(Effect a : effectList){
			a.use(entity);
		}
	}
}
