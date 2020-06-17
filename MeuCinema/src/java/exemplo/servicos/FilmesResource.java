/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.servicos;

import com.google.gson.Gson;
import exemplo.modelo.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("filmes")
public class FilmesResource {

    private List<Filme> filmes;

    /**
     * Creates a new instance of FilmesResource
     */
    public FilmesResource() {
        filmes = new ArrayList<Filme>();
        filmes.add(new Filme(1L, "Coringa", "Coringa, do diretor Todd Phillips, é uma história original e fictícia sobre o icônico vilão nunca antes vista no cinema. A versão de Phillips sobre Arthur Fleck, interpretado de maneira memorável por Joaquin Phoenix, mostra um homem lutando para se integrar à sociedade despedaçada de Gotham. Trabalhando como palhaço durante o dia, ele tenta a sorte como comediante de stand-up à noite... mas descobre que a piada é sempre ele mesmo. Preso em uma existência cíclica, oscilando entre a realidade e a loucura, Arthur toma uma decisão equivocada que causa uma reação em cadeia, com consequências cada vez mais graves e letais, nesta exploração ousada do personagem.\n" +
"Phoenix, três vezes indicado ao Oscar (“O Mestre”, “Johnny & June”, “Gladiador”), estrela no papel-título, ao lado do vencedor do Oscar Robert De Niro (“Touro Indomável”, “O Poderoso Chefão 2”). O filme também é estrelado por Zazie Beetz (“Deadpool 2”), Frances Conroy (da série de TV “American Horror Story”, da série da Hulu “Castle Rock Brett Cullen (“42 - A História De Uma Lenda”, da série da Netflix “Narcos”), Glenn Fleshler (das séries de TV “Billions” e “Barry”), Bill Camp (“Operação Red Sparrow”, “A Grande Jogada”), Shea Whigham (“O Primeiro Homem”, “Kong: A Ilha da Caveira”), Marc Maron (das séries de TV “Maron” e “GLOW”), Douglas Hodge (“Operação Red Sparrow”, da série de TV “Penny Dreadful”), Josh Pais (do inédito “Brooklyn Sem Pai Nem Mãe”, “Despedida em Grande Estilo”) e Leigh Gill (da série da HBO “Game of Thrones”).\n" +
"O indicado ao Oscar Phillips (“Borat - O Segundo Melhor Repórter do Glorioso País Cazaquistão Viaja à América”, trilogia “Se Beber, Não Case!”) dirige o filme a partir de um roteiro que ele coescreveu com o roteirista indicado ao Oscar Scott Silver (“O Vencedor”), com base nos personagens da DC. O filme foi produzido por Phillips e o indicado ao Oscar Bradley Cooper (“Nasce uma Estrela”, “Sniper Americano”), através da produtora Joint Effort; e a indicada ao Oscar Emma Tillinger Koskoff (“O Lobo de Wall Street”).   Os produtores executivos foram Michael E. Uslan, Walter Hamada, Aaron L. Gilbert, Joseph Garner, Richard Baratta e Bruce Berman.\n" +
"Nos bastidores, Phillips contou com o diretor de fotografia Lawrence Sher (“Godzilla II: Rei dos Monstros”, trilogia “Se Beber, Não Case!”), o desenhista de produção Mark Friedberg (“Se a Rua Beale Falasse”, “Selma - Uma Luta pela Igualdade”), o editor Jeff Groth (“Cães De Guerra”, “Se Beber, Não Case! Parte III”) e o figurinista vencedor do Oscar Mark Bridges (“Trama Fantasma”, “O Artista”). A música foi composta por Hildur Guðnadóttir (da série da HBO “Chernobyl”, “Sicario: Dia do Soldado”).\n" +
"A Warner Bros. Pictures apresenta, em associação com a Village Roadshow Pictures e a BRON Creative, Coringa, uma produção da Joint Effort, um filme de Todd Phillips. O filme estreia nos cinemas brasileiros em 3 de outubro de 2019 e será distribuído mundialmente pela Warner Bros. Pictures.", "Drama", 120, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/jfVTJm9NilA\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        filmes.add(new Filme(2L, "O Irlandês", "Robert De Niro, Al Pacino e Joe Pesci estrelam O IRLANDÊS, a saga épica do diretor Martin Scorsese sobre o crime organizado nos Estados Unidos pós-guerra. Contado através da perspectiva do veterano da Segunda Guerra Mundial Frank Sheeran, um assassino profissional que trabalhou ao lado de algumas das personalidades mais marcantes do século 20, o filme aborda um dos grandes mistérios da história americana – o desaparecimento do lendário líder sindical Jimmy Hoffa – e se transforma em uma jornada monumental pelos corredores do crime organizado: seus mecanismos, rivalidades e associações políticas.", "Máfia", 180, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/L78AvuU1FLg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        filmes.add(new Filme(3L, "Vingadores - Ultimato", "O final épico deste ciclo de aventuras dos Vingadores", "Quadrinhos", 170, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/4QRdB4RAQMs\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        filmes.add(new Filme(4L, "Rambo 5", "A última Aventura de Jhon Rambo", "Aventura", 130, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/FMGOUFv3Fhg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        filmes.add(new Filme(5L, "Homem-Aranha no Aranhaverso", "Surpreendente aventura do Homem-Aranha no aranhaverso", "Animação", 120, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/u417WmZn65M\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));        
    }

    /**
     * Retrieves representation of an instance of exemplo.servicos.FilmesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(filmes);
    }
    
    @Path("{filmeID}")
    @GET
    @Produces("application/json")
    public String getFilme(@PathParam("filmeID") String id){
        for(Filme filme : filmes){
            if(filme.getId().equals(Long.valueOf(id))) {
                Gson gson = new Gson();
                return gson.toJson(filme);
            }
        }
        return null;
    }
    
    /**
     * PUT method for updating or creating an instance of FilmesResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
