package com.maestroobjetos.test;
import com.maestroobjetos.especializacion.Ninja;
import com.maestroobjetos.especializacion.Samurai;
import com.maestroobjetos.especializacion.Wizard;
import com.maestroobjetos.human.human;

public class humanTest{
	public static void main(String[] args) {
		human diego = new human();
		human pepito = new human();
		Samurai julio = new Samurai();
		Samurai ernesto = new Samurai();
		Ninja felipe = new Ninja();
		Wizard Mash = new Wizard();
		
		diego.attack("Diego", "Pepito", pepito);
		System.out.println("La vida de pepito a bajado a: " + pepito.health);
		
		julio.deathBlow("Julio", "Pepito", pepito);
		System.out.println("La salud de Julio ha bajado a " + julio.health);
		System.out.println("La salud de pepito ha bajado a " + pepito.health);
		System.out.println("Pepito a muerto...");
		julio.meditate("Julio");
		ernesto.howMany("Ernesto");
		System.out.println("La salud de Julio ahora es de: " + julio.health);
		Mash.fireBall("Mash", "felipe", felipe);
		System.out.println("La salud de Felipe ha bajado a: " + felipe.health);
		felipe.steal("Felipe", "Mash", Mash);
		System.out.println("La salud de Mash es: " + Mash.health);
		System.out.println("La salud de Felipe es: " + felipe.health);
	}
}
