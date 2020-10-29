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
    	
    	port(6789); 
    	
    	staticFiles.location("/");
    	
    	get("/adotapp2/HTML", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new VelocityTemplateEngine().render(
                new ModelAndView(model, "adotapp2/HTML/index.html")
            );
        });
    	
        
        post("/processos", (request, response) -> Service.addProcessos(request, response));

        post("/processos/update/:codigo", (request, response) -> Service.updateProcessos(request, response));
        
        post("/adicionarUsuario", (request, response) -> user.addUsuarios(request, response));

        get("/processos/usuario", (request, response) -> Service.getAllProcessos(request, response));   
        
        get("/getUsuarios",  (request, response) -> user.getUsuario(request, response));
        
        //
        
    }
}

