package com.maestroobjetos.especializacion;
import com.maestroobjetos.human.human;

public class Wizard extends human {
	public int health = 50;
	public int intelligence = 8;
	
	public void heal(String NombreDelCasteador, String NombreDelObjetivo, human objetivo) {
		System.out.println(NombreDelCasteador + " Ha Curado a " + NombreDelObjetivo);
		objetivo.health += this.intelligence;
	}
	
	public void fireBall(String NombreDelCasteador, String NombreDelObjetivo, human objetivo) {
		System.out.println(NombreDelCasteador + " Ha lanzado una bola de fuego a " + NombreDelObjetivo);
		objetivo.health -= this.intelligence * 3;
	}
}
