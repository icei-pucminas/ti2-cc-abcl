package app;

import static spark.Spark.*;
import service.ProcessosService;

public class App{
	
	private static ProcessosService Service = new ProcessosService();
	
    public static void main(String[] args) {
        port(6789); 

        post("/processos", (request, response) -> Service.add(request, response));

        post("/processos/update/:codigo", (request, response) -> Service.update(request, response));

        get("/processos/:codigo", (request, response) -> Service.getAll(request, response));   
        
    }
}
