package com.maestroobjetos.human;

public class human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public void attack(String atacanteNombre, String targetNombre, human target) {
		System.out.println("¡¡¡ " +atacanteNombre + " ha a atacado a " + targetNombre + " !!!");
		target.health -= this.strength;
	}
}
