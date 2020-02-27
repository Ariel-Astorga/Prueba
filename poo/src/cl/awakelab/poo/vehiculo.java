package cl.awakelab.poo;

public class vehiculo implements IVehiculo {

	@Override
	public void abrirPuerta(int puerta) {
		System.out.println("abrir puerta n ");
	}

	@Override
	public int contarPasajeroDentro() {
		// TODO Auto-generated method stub
		return 4;
	}
private int cantidadNeumaticos;

	
	public int getCantidadNeumaticos() {
	return cantidadNeumaticos;
}

public void setCantidadNeumaticos(int cantidadNeumaticos) {
	this.cantidadNeumaticos = cantidadNeumaticos;
}

	@Override
	public boolean validarCinturonDeseguridad() {
		// TODO Auto-generated method stub
		return false;
	}

}
