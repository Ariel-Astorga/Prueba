package cl.awakelab.m;

import cl.awakelab.poo.*;

public class ejecutable {

	public static void main(String[] args) {
		MedioDeTransporte m1 = new MedioDeTransporte(200, 25, 5, 250);
		MedioDeTransporte m2 = new MedioDeTransporte();
		
		elefante e1 = new elefante( 60, 200, 4, 400, 20);
		
		System.out.println("velocidadMaxim : " + m1.getVelocidadMaxima());
		System.out.println("autonomia e1 :" + e1.getAutonomia());
		System.out.println("autonomia m1 :" + m1.getAutonomia());
		System.out.println("autonomia m2 :" + m2.getAutonomia());
		acelerar(m2, 2);
	}

	public static void acelerar(MedioDeTransporte mdt, int incremento) {
		for(int i = 0; i < incremento; i++) {
			mdt.avanzar();
		}
	}
}
