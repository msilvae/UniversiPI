package core;

public class QuestaoComDica extends QuestaoSimples{

	protected String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	//Métodos
	@Override
	public String aplicarQuestao() {
		return this.enunciado + "\n"
		+ "Dica:  " + this.dica;
	}

	
}
