package utils;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

@Provider
public class CorsFilter implements ContainerResponseFilter {
	/*@Override
    public ContainerResponse filter(ContainerRequest req, ContainerResponse contResp) {

        ResponseBuilder resp = Response.fromResponse(contResp.getResponse());
        resp.header("Access-Control-Allow-Origin", "http://localhost:4200")
        .header("Access-Control-Allow-Credentials", "true")
        
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, PATCH, DELETE, OPTIONS")
                .header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept")
                .header("Content-Type", "application/json");

        String reqHead = req.getHeaderValue("Access-Control-Request-Headers");

        if(null != reqHead && !reqHead.equals("")){
            resp.header("Access-Control-Allow-Headers", reqHead);
        }

        contResp.setResponse(resp.build());
           return contResp;
    }*/
	@Override
	public ContainerResponse filter(ContainerRequest req, ContainerResponse crunchifyContainerResponse) {
		System.out.print("entre a la definicion del container");
        ResponseBuilder crunchifyResponseBuilder = Response.fromResponse(crunchifyContainerResponse.getResponse());
        
        // *(allow from all servers) OR https://crunchify.com/ OR http://example.com/
        crunchifyResponseBuilder.header("Access-Control-Allow-Origin", "http://localhost:4200")
        
        // As a part of the response to a request, which HTTP methods can be used during the actual request.
        .header("Access-Control-Allow-Methods", "*")
        
        // How long the results of a request can be cached in a result cache.
        .header("Access-Control-Max-Age", "151200")
        // As part of the response to a request, which HTTP headers can be used during the actual request.
        //"X-Requested-With,content-type,access-control-allow-origin,access-control-allow-methods,access-control-allow-headers"
        .header("Access-Control-Allow-Headers", "*");
        //.header("Content-Type", "application/json");
        String crunchifyRequestHeader = req.getHeaderValue("Access-Control-Request-Headers");
        System.out.println("****************** CORS Configuration Completed *******************");
        if (null != crunchifyRequestHeader && !crunchifyRequestHeader.equals(null)) {
            crunchifyResponseBuilder.header("Access-Control-Allow-Headers", crunchifyRequestHeader);
        }
        
        if ("OPTIONS".equals(req.getMethod())){
        	crunchifyResponseBuilder.status(200);
        	//req.sta; //HttpStatus.SC_NO_CONTENT = 204
        	crunchifyResponseBuilder.header("Access-Control-Allow-Methods", "POST, GET, DELETE, OPTIONS, DELETE")
        	.header("Access-Control-Allow-Headers", "Content-Type, x-requested-with, Token") 
        	.header("Access-Control-Max-Age", "1");                        
          }
        
 
        crunchifyContainerResponse.setResponse(crunchifyResponseBuilder.build());
        return crunchifyContainerResponse;
    }
	
}


   