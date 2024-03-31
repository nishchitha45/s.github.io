package com.arena;

public class Player {
	
	//Defined the mentioned attribute given in the game
	private int health;
    private int strength;
    private int attack;
    
    //Creating getter and setter
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	//Parameterized constructor
	public Player(int health, int strength, int attack) {
		super();
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	} 
}
