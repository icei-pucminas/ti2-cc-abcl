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
		response.header("Content-Type", "application/json");
		dao.conectar();
		
		String nome = request.queryParams("nome");
		String sobrenome = request.queryParams("sobrenome");
		String email = request.queryParams("email");
		String telefone = request.queryParams("telefone");
		String senha = request.queryParams("senha");
		
		Usuario user = new Usuario(nome, sobrenome, senha, email, telefone);
		
		System.out.println(user.toString());
		
		if(DAOUsuarios.getUsuario(email) == null){
			dao.addUsuarios(user);
			response.status(201);
		}else{
			//NÃO MANDAR RESPOSTA DE ERRO!!!
			response.status(400);
		}

		dao.close();
		
		return user.toJson();
		
	}
	
	public Object getUsuario (Request request, Response response){
		response.header("Content-Type", "application/json");
		dao.conectar();
		
		String email = request.queryParams("email");

			Usuario user = dao.getUsuario(email);
			response.status(201);


		dao.close();
		
		return user.toJson();
		
	}
	
	public Object loginUsuario (Request request, Response response){
		response.header("Content-Type", "application/json");
		dao.conectar();
		
		String email = request.queryParams("email");
		String senha = request.queryParams("senha");

		Usuario user = dao.loginUsuario(email, senha);
		response.status(201);

		dao.close();
		
		return user.toJson();
		
	}
	
	// public Object Usuarios(Request request, Response response) {
	// 	dao.conectar();

	// 	StringBuffer valores = new StringBuffer("[");
	// 	int cont = 0;
	// 	Gson gson = new GsonBuilder().create();
	// 	for(Usuario user : DAOUsuarios.getUsuarios()){
	// 		valores.append(gson.toJSON(user));
	// 		cont++;
	// 		if(cont != DAOUsuarios.getUsuarios().length)
	// 			valores.append(",\n");
	// 	}
	// 	valores.append("]");

	// 	response.header("Content-Type", "application/json");
    //     response.header("Content-Encoding", "UTF-8");
	// 	dao.close();

	// 	return valores.toString();
	// }
}
