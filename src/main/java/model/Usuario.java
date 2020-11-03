package model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Usuario implements JsonFormatter {
	
	private int id = 0;
	private String nome;
	private String sobrenome;
	private String senha;
	private String email;
	private String telefone;
	private int processo_ativo = 1;
	
	public int getProcesso_ativo() {
		return processo_ativo;
	}
	public void setProcesso_ativo(int processo_ativo) {
		this.processo_ativo = processo_ativo;
	}
	public Usuario(int id, String nome, String sobrenome, String senha, String email, String telefone, int processo_ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
		this.email = email;
		this.telefone = telefone;
		this.processo_ativo = processo_ativo;
	}
	public Usuario(String nome, String sobrenome, String senha, String email, String telefone, int processo_ativo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
		this.email = email;
		this.telefone = telefone;
		this.processo_ativo = processo_ativo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", senha=" + senha + ", email="
				+ email + ", telefone=" + telefone + "]";
	}
	@Override
	public JsonObject toJson() {
		JsonObject obj = new JsonObject();
		obj.addProperty("id", id);
		obj.addProperty("nome", nome);
		obj.addProperty("email", email);
		obj.addProperty("sobrenome", sobrenome);
		obj.addProperty("senha", senha);
		obj.addProperty("telefone", telefone);
		obj.addProperty("processo_ativo", processo_ativo);
		return obj;
	}
}
