package com.codeblock.furywars.game.effects;

import com.codeblock.furywars.game.classes.Effect;
import com.codeblock.furywars.game.classes.Entity;

public class Heal extends Effect {
	static String name = "HealEffect";
	int power = 1;
	
	public Heal(int power){
		super(name);
		this.power = power;
	}

	@Override
	public void use(Entity e) {
		if(e.maxHealth < (e.health+10*power)){
			e.health+=10*power;
		}else{
			e.health = e.maxHealth;
		}
	}
}
