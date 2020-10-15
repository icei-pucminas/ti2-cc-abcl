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

		dao.addProcesso(processo);

		response.status(201); // 201 Created
		dao.close();
		return nome;
	}

	public String update(Request request, Response response) {
		DAOProcessos dao = new DAOProcessos();
        dao.conectar();
            
		int user_id = Integer.parseInt(request.queryParams("user_id"));
		int codigo_processo = Integer.parseInt(request.queryParams("codigo_processo"));
	    
	    Processo processo = dao.getProcesso(user_id, codigo_processo);
		dao.atualizarStatusProcesso(processo);

		response.status(201); // 201 Created
		dao.close();
		return "atualizado";
	}

	public Object getAll(Request request, Response response) {
		DAOProcessos dao = new DAOProcessos();
        DAOUsuarios daoU = new DAOUsuarios();
        dao.conectar();
        int user_id = Integer.parseInt(request.queryParams("codigo"));
        
        Usuario user = daoU.getUsuario(user_id);
        
		StringBuffer returnValue = new StringBuffer("<processos type=\"array\">");
		for (Processo processos : dao.getProcessos(user)) {
			Processo processo = (Processo) processos;
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
	}

}
