package designpattens.strategy;

public class Carro implements Transporte {

	@Override
	public void viajar() {
		System.out.println("Viajando de carro...");
		
	}

}
