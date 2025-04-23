package br.dev.arthur.tabuada.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.arthur.tabuada.model.Tabuada;

public class TelaTabuada {

	private String tituloDaTela;
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMaxMultiplicador;
	private JTextField textMinMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;

	public void criarTela(String tituloDaTela) {

		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);

		// Obtendo a referência do painel de conteúdo da tela
		Container container = tela.getContentPane();

		// criar o label multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 150, 30);

		// criar o text field Multiplicando
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);

		// Criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador:");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);

		// criar o text field MinMultiplicador
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);

		// Criar o label MinMultiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador:");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);

		// criar o text field MaxMultiplicador
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);

		// criar o ButtonCalcular
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);

		// criar o ButtonLimpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);

		// Adicionar o Jlist na tela
		listTabuada = new JList();

		// Criar o ScrollPane
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 190, 210, 300);

		// Adicionando os componentes no painel de conteúdo do Jframe
		container.add(labelMultiplicando);
		container.add(textMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(textMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		container.add(scrollTabuada);
		
		//adicionar ouvintes de ação aos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = textMultiplicando.getText();
				String min = textMinMultiplicador.getText();
				String max = textMaxMultiplicador.getText();
				
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minDouble = Double.parseDouble(min);
				double maxDouble = Double.parseDouble(max);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minDouble);
				tabuada.setMaximoMultiplicador(maxDouble);
				
				String[] tabuadaResult = tabuada.mostrarTabuada();
				
				listTabuada.setListData(tabuadaResult);
				
				tabuada.mostrarTabuada();
				
			}
			
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMinMultiplicador.setText("");
				textMaxMultiplicador.setText("");
				listTabuada.setListData(new String[0]);
				textMultiplicando.requestFocus();
			}
		});

		// Tornar a tela visível "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);
	}

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

}
