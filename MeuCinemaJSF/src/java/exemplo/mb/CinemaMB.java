/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.mb;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import exemplo.modelo.Filme;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author user
 */
@ManagedBean
public class CinemaMB {
    
    public List<Filme> getFilmesEmCartaz() {
        Client c = Client.create();
        WebResource wr = c.resource("http://localhost:8080/MeuCinema/webresources/filmes");
        String json = wr.get(String.class);
        
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Filme>>(){}.getType());
    }
    
}
