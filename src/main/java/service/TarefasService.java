package service;
import static spark.Spark.*;
import spark.*;

import dao.DAOProcessos;
import dao.DAOTarefas;
import model.Processo;
import model.Tarefa;

public class TarefasService {
    private DAOTarefas dao;
	private DAOProcessos daoP;
	
	public TarefasService(){
		dao = new DAOTarefas();
		daoP = new DAOProcessos();
	}

    /*
	public Object addProcessos(Request request, Response response) {
        dao.conectar();
        
		boolean ajuda = Boolean.parseBoolean(request.queryParams("ajuda"));
		boolean completo = Boolean.parseBoolean(request.queryParams("completo"));
		int user_id = Integer.parseInt(request.queryParams("user_id"));
		int codigo_processo = Integer.parseInt(request.queryParams("codigo_processo"));
	    String nome = request.queryParams("nome");

		Processo processo = new Processo(ajuda, completo, user_id, codigo_processo, nome);

		DAOProcessos.excluirProcesso(codigo_processo, user_id);
		boolean status = dao.addProcesso(processo);
		if(status == false)
			return "processo j� existente no banco de dados";
		

		response.status(201); // 201 Created
		dao.close();
		if(status)
			return nome;
		else 
			return "não foi possivel localizar o usuario";
	}

	public Object updateProcessos(Request request, Response response) {
		System.out.println("cheguei aqui");
        dao.conectar();
        daoU.conectar();
            
		int id = Integer.parseInt(request.queryParams("id"));
		
		Usuario user = daoU.getUsuario(id);  
	    Processo processo = dao.getProcesso(id);
	    
		dao.atualizarStatusProcesso(processo);

		response.status(201); // 201 Created
		dao.close();
		return user.toJson();
	}

	public Object getAllProcessos(Request request, Response response) {
		daoU.conectar();
		dao.conectar();
        int user_id = Integer.parseInt(request.queryParams("codigo"));
        
        Usuario user = daoU.getUsuario(user_id);
        
        if(user == null)
			return "n�o foi poss�vel localizar usuario";
        
		StringBuffer returnValue = new StringBuffer("<processos type=\"array\">");
		
		Processo processo_teste[] = dao.getProcessos(user);
		if(processo_teste == null)
				return "n�o h� processos ativos para este usuario";
		
		for (Processo processos : dao.getProcessos(user)) {
			Processo processo = dao.getProcesso(user_id);
			
			returnValue.append("<processo>\n" + 
            		"\t<nome> " + processo.getNome() + " </nome>\n" +
            		"\t<status> " + (processo.isCompleto()? "completo" : "nao completo") + " </status>\n" +
            		"</processo>\n");
		}
		returnValue.append("</processos>");
	    response.header("Content-Type", "application/xml");
	    response.header("Content-Encoding", "UTF-8");
		dao.close();
		daoU.close();
		return returnValue.toString();
//        return request.queryParams("codigo");
    }
    */
}
