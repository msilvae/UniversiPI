

package userinterface;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import core.QuestaoComDica;
import core.QuestaoSimples;
import core.QuestaoMultiplaEscolha;

public class AplicaProva {

	public static void main(String[] args) {

		ArrayList<QuestaoSimples> listaQuestoes = new ArrayList();
		String resposta;
		int respostaCerta=0;
		double resultadofinal = 0.0d;
				
		//Cadastro de Perguntas Simples
		listaQuestoes.add(new QuestaoSimples("Java � igual Javascript?","N�o")); 
		listaQuestoes.add(new QuestaoSimples("Java � melhor que Python?","Sim"));
		
		//Cadastro de Perguntas Multipla escolha
		listaQuestoes.add(new QuestaoMultiplaEscolha("Qual a melhor linguagem de Programa��o?","Java","C++","Java", "dotNet", "Cobol"));
		listaQuestoes.add(new QuestaoMultiplaEscolha("Qual linguagem de Programa��o mais antiga?","Fortran","Java","Cobol", "Fortran", "Ruby"));
				
		//Cadastro de Perguntas Com Dicas

		listaQuestoes.add(new QuestaoComDica("HTML � melhor que o Java?","N�o","Lembre-se do conceito de linguagens de programa��o"));
		
		//Execu��o da prova
		for (QuestaoSimples questaoSimples : listaQuestoes) {			
			resposta = JOptionPane.showInputDialog(questaoSimples.aplicarQuestao());
			if(questaoSimples.corrigir(resposta))
				respostaCerta++;
		}
		
		//Resultado Final
		DecimalFormat df = new DecimalFormat ("#,##0.00%");
		resultadofinal = (double)respostaCerta / listaQuestoes.size();
		JOptionPane.showMessageDialog(null, "Resultado = " + df.format(resultadofinal));
	}

}
