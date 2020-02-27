package cl.awakelab.poo;

public class MedioDeTransporte {
	
	private float velocidadMaxima;
	private float kilometroPorLitros;
	private int capacidadPasajero;
	private float autonomia;
	
	
	public MedioDeTransporte() {
		
	}
	
	public MedioDeTransporte(float velocidadMaxima, float kilometroPorLitros, int capacidadPasajero, float autonomia) {
		super();
		this.velocidadMaxima = velocidadMaxima;
		this.kilometroPorLitros = kilometroPorLitros;
		this.capacidadPasajero = capacidadPasajero;
		this.autonomia = autonomia;
	}
	public void avanzar() {
		System.out.println("estoy avanzando");
	}
	public void frenar() {
		System.out.println("estoy deteniendome");
	}

	public void chocar() {
		System.out.println("teni seguro?");
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public float getKilometroPorLitros() {
		return kilometroPorLitros;
	}
	public void setKilometroPorLitros(float kilometroPorLitros) {
		this.kilometroPorLitros = kilometroPorLitros;
	}
	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}
	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}
	public float getAutonimia() {
		return autonomia;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}

	
	
}
