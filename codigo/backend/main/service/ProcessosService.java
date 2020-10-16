package service;
import static spark.Spark.*;
import spark.*;

import dao.DAOProcessos;
import dao.DAOUsuarios;
import model.Processo;
import model.Usuario;

public class ProcessosService{

	private DAOProcessos dao;

	public ProcessosService(){
		dao = new DAOProcessos();
	}

	public Object add(Request request, Response response) {
		DAOProcessos dao = new DAOProcessos();
        dao.conectar();
        
		boolean ajuda = Boolean.parseBoolean(request.queryParams("ajuda"));
		boolean completo = Boolean.parseBoolean(request.queryParams("completo"));
		int user_id = Integer.parseInt(request.queryParams("user_id"));
		int codigo_processo = Integer.parseInt(request.queryParams("codigo_processo"));
	    String nome = request.queryParams("nome");

		Processo processo = new Processo(ajuda, completo, user_id, codigo_processo, nome);

		boolean status = dao.addProcesso(processo);

		response.status(201); // 201 Created
		dao.close();
		if(status)
			return nome;
		else 
			return "não foi possível localizar usuario";
	}

	public String update(Request request, Response response) {
		DAOProcessos dao = new DAOProcessos();
        dao.conectar();
            
		int user_id = Integer.parseInt(request.queryParams("user_id"));
		int codigo_processo = Integer.parseInt(request.queryParams("codigo_processo"));
	    
	    Processo processo = dao.getProcesso(user_id);
		dao.atualizarStatusProcesso(processo);

		response.status(201); // 201 Created
		dao.close();
		return "atualizado";
	}

	public Object getAll(Request request, Response response) {
		DAOProcessos dao = new DAOProcessos();
        DAOUsuarios daoU = new DAOUsuarios();
        dao.conectar();
        daoU.conectar();
        int user_id = Integer.parseInt(request.queryParams("codigo"));
        
        Usuario user = (Usuario) daoU.getUsuario(user_id);
        
        if(user.getId() != user_id)
			return "não foi possível localizar usuario";
        
		StringBuffer returnValue = new StringBuffer("<processos type=\"array\">");
		for (Processo processos : dao.getProcessos(user)) {
			Processo processo = dao.getProcesso(user_id);
			returnValue.append("<processo>\n" + 
            		"\t<nome> " + processo.getNome() + "</nome>\n" +
            		"\t<status> " + (processo.isCompleto()? "completo" : "nao completo") + "</status>\n" +
            		"</processo>\n");
		}
		returnValue.append("</processos>");
	    response.header("Content-Type", "application/xml");
	    response.header("Content-Encoding", "UTF-8");
	    dao.close();
		return returnValue.toString();
//        return request.queryParams("codigo");
	}

}
