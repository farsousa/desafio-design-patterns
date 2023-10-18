package designpattens;

import designpattens.singleton.Singleton;
import designpattens.strategy.Aviao;
import designpattens.strategy.Carro;
import designpattens.strategy.Moto;
import designpattens.strategy.Passageiro;

public class DesignPatternApplication {
	
	public static void main(String[] args) {
		//Singleton
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton1 == singleton2) {
			System.out.println("Objetos estão no mesmo endereço de memória: " + singleton1 + " | " + singleton2);
		}else {
			System.out.println("Objetos não estão no mesmo endereço de memória"  + singleton1 + " | " + singleton2);
		}
		
		//Strategy
		Passageiro passageiro = new Passageiro();
		passageiro.setTransporte(new Aviao());
		passageiro.viajar();
		
		passageiro.setTransporte(new Moto());
		passageiro.viajar();
		
		passageiro.setTransporte(new Carro());
		passageiro.viajar();
		
	}

}
