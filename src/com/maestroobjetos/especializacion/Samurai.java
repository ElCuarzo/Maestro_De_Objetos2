package com.maestroobjetos.especializacion;
import com.maestroobjetos.human.human;

public class Samurai extends human{
	public int health = 200;
	private static int count = 0;
	
	public Samurai() {
		count++;
	}
	
	public void deathBlow(String NombreDelCasteador, String NombreDelObjetivo, human objetivo) {
		System.out.println(NombreDelCasteador + " Ha asesinado a sangre fria a " + NombreDelObjetivo);
		objetivo.health = 0;
		this.health -= 100;
	}
	
	public void meditate(String NombreDelCasteador) {
		System.out.println(NombreDelCasteador + " Esta meditando, Ha podido regenerar la mitad de su salud!");
		this.health += this.health/2;
	}
	
	public void howMany(String NombreDelCasteador) {
		System.out.println(NombreDelCasteador + " Es el samurai numero: " + count);
	}
}
