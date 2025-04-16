package br.dev.arthur.tabuada;

import javax.swing.JTextField;

import br.dev.arthur.tabuada.gui.TelaTabuada;
//import br.dev.arthur.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela("Tabuada DS1MA");
		
		/*
		//brincando com vetores
		double[] notas = new double[4];
		notas[0] = 7.0;
		notas[1] = 8.3;
		notas[2] = 8.1;
		notas[3] = 6.9;
		
		System.out.println(notas[2]);
		System.out.println(notas[0] + notas[3]);
		
		notas[0] = 7.7;
		System.out.println(notas[0] + notas[3]);
		
		System.out.println(notas.length);
		
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
//		System.out.println("Média: " + media);
		
		int i = 0;
		double totalNotas = 0.0;
		while (i < notas.length) {
			totalNotas += notas[i];
			i++;
		}
		
		media = totalNotas / notas.length;
		
//		System.out.println("A média do aluno é " + media);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		String[] cidades = new String[6];
		cidades[0] = "saquarema, ";
		cidades[1] = "madureira, ";
		cidades[2] = "marechal, ";
		cidades[3] = "niteroi, ";
		cidades[4] = "rio de janeiro, ";
		cidades[5] = "realengo";
		
		i = 0;
		while (i < cidades.length) {
			System.out.println(i + "-" + cidades[i]);
			i++;
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		String[] equipamentos = {
				"mouse", 
				"teclado", 
				"monitor", 
				"impressora", 
				"scanner", 
				"access point", 
				"roteador"};
			i = 0;
		while (i < equipamentos.length) {
			System.out.println(i + 1 + "-" + equipamentos[i]);
			i++;
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		double precos[] = {12.5, 28.99, 65.78, 71.99};
		
//		JTextField campos[] = new JTextField()[10];
	*/
	}
}
