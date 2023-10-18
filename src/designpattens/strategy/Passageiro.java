package designpattens.strategy;

public class Passageiro {
	
	private Transporte transporte;
	
	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	
	public void viajar() {
		this.transporte.viajar();
	}

}
