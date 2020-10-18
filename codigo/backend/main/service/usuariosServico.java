package service;

import spark.Request;
import spark.Response;
import dao.DAOUsuarios;
import model.Usuario;

public class usuariosServico {
	private DAOUsuarios dao;
	
	public usuariosServico() {
		dao = new DAOUsuarios();
	}
		
	public Object addUsuarios (Request request, Response response){
		dao.conectar();
		
		String nome = request.queryParams("nome");
		String sobrenome = request.queryParams("sobrenome");
		String email = request.queryParams("email");
		String telefone = request.queryParams("telefone");
		String senha = request.queryParams("senha");
		
		Usuario user = new Usuario(nome, sobrenome, senha, email, telefone);
		
		dao.addUsuarios(user);
		response.status(201);
		
		dao.close();
		
		return nome;
		
	}
}
