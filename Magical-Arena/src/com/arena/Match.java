package com.arena;

import java.util.Random;

public class Match {
	
	private Player attacker;
    private Player defender;
    private Random random;
    
    public Match(Player player1, Player player2) {
    	
        this.attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        this.defender = player1.getHealth() < player2.getHealth() ? player2 : player1;
        this.random = new Random();
    }
    
    public void fight() {
    	
    	//in a loop as long as both the attacker and defender have health greater than 0. 
    	//Once a player's health drops to 0 or below, the loop exits, indicating the end of the match.
        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
        	
        	//Dice Rolling
            int attackRoll = random.nextInt(6) + 1;
            int defendRoll = random.nextInt(6) + 1;

            //Attack damage is calculated by multiplying the attack roll with the attacker's attack attribute.
            int attackDamage = attackRoll * attacker.getAttack();
            
            //Defense damage is calculated by multiplying the defense roll with the defender's strength attribute.
            int defendDamage = defendRoll * defender.getStrength();
            
            //The net damage is computed by subtracting the defense damage from the attack damage.
            int netDamage = Math.max(0, attackDamage - defendDamage);
            
            //The net damage is deducted from the defender's health. 
            //If the defender's health drops to 0 or below, the loop exits, indicating the end of the match.
            defender.setHealth(defender.getHealth() - netDamage);

            // Switch roles for next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

}
