package model;

public class Processo {
	private boolean ajuda;
	private boolean completo;
	private int user_id;
	private int codigo_processo;
	private String nome_processo;
	
	public String getNome() {
		return nome_processo;
	}
	public void setNome(String nome) {
		this.nome_processo = nome;
	}
	
	public Processo(boolean ajuda, boolean completo, int user_id, int codigo_processo, String nome) {
		super();
		this.ajuda = ajuda;
		this.completo = completo;
		this.user_id = user_id;
		this.codigo_processo = codigo_processo;
		this.nome_processo = nome;
	}
	
	public Processo(boolean ajuda, int user_id, int codigo_processo, String nome) {
		super();
		this.ajuda = ajuda;
		this.completo = false;
		this.user_id = user_id;
		this.codigo_processo = codigo_processo;
		this.nome_processo = nome;
	}
	
	public boolean isAjuda() {
		return ajuda;
	}
	public void setAjuda(boolean ajuda) {
		this.ajuda = ajuda;
	}
	public boolean isCompleto() {
		return completo;
	}
	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCodigo_processo() {
		return codigo_processo;
	}
	public void setCodigo_processo(int codigo_processo) {
		this.codigo_processo = codigo_processo;
	}
	@Override
	public String toString() {
		return "Processo [ajuda=" + ajuda + ", completo=" + completo + ", user_id=" + user_id + ", codigo_processo="
				+ codigo_processo + ", nome=" + nome_processo + "]";
	}

	


}
