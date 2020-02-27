package cl.awakelab.poo;


public class elefante extends MedioDeTransporte {
	
	private float kilosDePopo;

	
	
	public elefante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public elefante(float velocidadMaxima, float kilometroPorLitros, int capacidadPasajero, float autonomia, float kilosDePopo) {
		super(velocidadMaxima, kilometroPorLitros, capacidadPasajero, autonomia);
		this.kilosDePopo =  kilosDePopo;
		// TODO Auto-generated constructor stub
	}

	public float getKilosDePopo() {
		return kilosDePopo;
	}

	public void setKilosDePopo(float kilosDePopo) {
		this.kilosDePopo = kilosDePopo;
	}
	
	

}
