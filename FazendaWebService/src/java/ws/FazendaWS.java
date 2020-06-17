/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import modelo.Usuario;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("fazenda")
public class FazendaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FazendaWS
     */
    public FazendaWS() {
    }

    /**
     * Retrieves representation of an instance of ws.FazendaWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getJson() {
        return "meu primeiro WS RESTFull";
    }
    
//    @GET
//    @Produces("application/json")
//    @Path("Usuario/get")
//    public String getUsuario(){
//        Usuario u = new Usuario();
//        u.setEmail("regis@regis.com");
//        u.setLogin("regis");
//        u.setSenha("23");
//        u.setPerfil("Admin");
//        // Converter para Json usando a biblioteca Gson do Google
//        Gson g = new Gson();
//        return g.toJson(u);
//    }
    
    @GET
    @Produces("application/json")
    @Path("Usuario/get/{login}")
    public String getUsuario(@PathParam("login") String login){
        Usuario u = new Usuario();
        
        u.setLogin(login);
        
        UsuarioDAO dao = new UsuarioDAO();
        u = dao.buscar(u);
        
        // Converter para Json usando a biblioteca Gson do Google
        Gson g = new Gson();
        return g.toJson(u);
    }
    
    @GET
    @Produces("application/json")
    @Path("Usuario/list")
    public String listUsuarios(){
        
//        List<Usuario> lista = new ArrayList<Usuario>();
//        
//        Usuario u = new Usuario();
//        u.setEmail("regis@regis.com");
//        u.setLogin("regis");
//        u.setSenha("23");
//        u.setPerfil("Admin");
//        
//        lista.add(u);
//        
//        u = new Usuario();
//        u.setEmail("jose@jose.com");
//        u.setLogin("jose");
//        u.setSenha("54");
//        u.setPerfil("User");
//        
//        lista.add(u);
//        
//        // Converter para Json usando a biblioteca Gson do Google
//        Gson g = new Gson();
//        return g.toJson(lista);
        
        List<Usuario> lista;
        
        UsuarioDAO dao = new UsuarioDAO();
        lista = dao.listar();
        
        // Converter para Json usando a biblioteca Gson do Google
        Gson g = new Gson();
        return g.toJson(lista);
    }

    /**
     * PUT method for updating or creating an instance of FazendaWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
