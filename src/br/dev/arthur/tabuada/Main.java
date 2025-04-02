package br.dev.arthur.tabuada;

import br.dev.arthur.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		Tabuada tabuada = new Tabuada();
		tabuada.setMultiplicando(8);
		tabuada.setMinimoMultiplicador(14);
		tabuada.setMaximoMultiplicador(20);
		tabuada.mostrarTabuada();
		
		Tabuada tabuada2 = new Tabuada();
		tabuada2.setMultiplicando(457);
		tabuada2.setMinimoMultiplicador(56);
		tabuada2.setMaximoMultiplicador(18);
		tabuada2.mostrarTabuada();
		
		System.out.println(tabuada.getMultiplicando());
		double mult1 = tabuada.getMultiplicando();
		
		if (mult1 % 2 == 0) {
			System.out.println("o multiplicando " +mult1 + " é par");
		} else {
			System.out.println("o multiplicando " +mult1 + " é impar");
		}
		
	}

}
