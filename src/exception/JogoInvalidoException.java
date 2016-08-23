package exception;

public class JogoInvalidoException extends Exception{
	
	private String mensagem;
	
	public JogoInvalidoException(String mensagem){
		this.mensagem = mensagem;
	}
	
	public String getMensagem(){
		return this.mensagem;
	}

}
