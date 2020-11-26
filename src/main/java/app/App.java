package app;

import static spark.Spark.*;
import service.ProcessosService;
import service.usuariosServico;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.*;

public class App{
	
	private static ProcessosService Service = new ProcessosService();
	private static usuariosServico user = new usuariosServico();
	
    public static void main(String[] args) {
    	
    	if(System.getenv("PORT") != null){
            port(Integer.parseInt(System.getenv("PORT")));
        }
    	
    	staticFiles.location("/");
    	
    	get("/adotapp2/HTML", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new VelocityTemplateEngine().render(
                new ModelAndView(model, "adotapp2/HTML/index.html")
            );
        });
    	
        
        post("/processos", (request, response) -> Service.addProcessos(request, response));

        post("/processos/update", (request, response) -> Service.updateProcessos(request, response));
        
        post("/usuarios/update", (request, response) -> user.updateUsuario(request, response));
        
        post("/adicionarUsuario", (request, response) -> user.addUsuarios(request, response));

        get("/processos/usuario", (request, response) -> Service.getAllProcessos(request, response));   
        
        get("/recebeUsuario",  (request, response) -> user.getUsuario(request, response));
        
        get("/loginUsuario",  (request, response) -> user.loginUsuario(request, response));
        
    }
}
