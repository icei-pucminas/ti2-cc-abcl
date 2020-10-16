package app;

import static spark.Spark.*;
import service.ProcessosService;

public class App{
	
	private static ProcessosService Service = new ProcessosService();
	
    public static void main(String[] args) {
        port(6789); 

        post("/processos", (request, response) -> Service.addProcessos(request, response));

        post("/processos/update/:codigo", (request, response) -> Service.updateProcessos(request, response));

        get("/processos/usuario/", (request, response) -> Service.getAllProcessos(request, response));   
        
    }
}

