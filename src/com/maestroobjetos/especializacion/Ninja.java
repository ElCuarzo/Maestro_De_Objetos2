package com.maestroobjetos.especializacion;
import com.maestroobjetos.human.human;

public class Ninja extends human{
	
	public void steal(String NombreDelCasteador, String NombreDelObjetivo, human objetivo ) {
		System.out.println(NombreDelCasteador + " Ha robado la salud de " + NombreDelObjetivo);
		objetivo.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway(String NombreDelCasteador) {
		System.out.println(NombreDelCasteador + " Se ha ido echando leches!!");
		this.health -= 10;
	}
}
