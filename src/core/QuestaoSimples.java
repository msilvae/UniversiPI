package core;

public class QuestaoSimples {

	protected String enunciado;
	protected String resposta;	
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	
	//Getters & Setters
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	//Métodos
	public String aplicarQuestao() {
		return this.enunciado;
	}
	
	public boolean corrigir(String resposta){
		return resposta.equalsIgnoreCase(this.resposta);
	}
	
}
