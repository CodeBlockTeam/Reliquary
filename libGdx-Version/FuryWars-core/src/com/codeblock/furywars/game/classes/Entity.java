package com.codeblock.furywars.game.classes;

import java.util.ArrayList;

public class Entity {
	public String name;
	public int xp, xpLevel;
	public int health, maxHealth;
	public ArrayList<Spell> spells = new ArrayList<Spell>();
	
	public Entity(String name, int xp, int xpLevel, int health, int maxHealth){
		this.name = name;
		this.xp = xp;
		this.xpLevel = xpLevel;
		this.health = health;
		this.maxHealth = maxHealth;
	}
}
