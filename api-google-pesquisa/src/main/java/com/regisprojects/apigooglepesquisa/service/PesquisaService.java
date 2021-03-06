/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.apigooglepesquisa.service;

import com.regisprojects.apigooglepesquisa.model.Pesquisa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class PesquisaService {
    
    private String urlString = "https://www.google.com/search?q=";

    public List<Pesquisa> getConnection(String parametroDeBusca) {

        String url = urlString + parametroDeBusca;

        try {
            
            Document doc = Jsoup.connect(url).get();

            Elements links = doc.select("div.TbwUpd.NJjxre");
            Elements titulos = doc.select("h3.LC20lb.DKV0Md span:nth-child(1)");

            // Colocar os links obtidos da listaLinks
            List<String> listaLinks = new ArrayList<>();
            for (Element el : links) {
                listaLinks.add(el.text());
            }
            
            // Formatar os links obtidos na listaLinks colocando-os já formatados na listaLinkFormatada
            String formater;
            List<String> listaLinkFormatada = new ArrayList<>();
            for (String link : listaLinks) {
                formater = link.trim();
                formater = formater.replaceAll(" ", "");
                formater = formater.replaceAll("›", "/");
                link = formater;
                listaLinkFormatada.add(link);
            }
            
            // Colocar os títulos obtidos na listaTitulos
            List<String> listaTitulos = new ArrayList<>();
            for (Element el : titulos) {
                listaTitulos.add(el.text());
            }
            
            // Método para unir as listas de links e títulos em uma só lista, a listaPesquisa
            List<Pesquisa> listaPesquisa = populaListaPesquisa(listaTitulos, listaLinkFormatada);

            return listaPesquisa;
        
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    private List<Pesquisa> populaListaPesquisa(List<String> listaTitulos, List<String> listaLinkFormatada) {

        List<Pesquisa> listaPesquisa = new ArrayList<>();

        String[] titulos = new String[10];
        int i = 0;
        for (String titulo : listaTitulos) {
            titulos[i] = titulo;
            i++;
        }

        String[] links = new String[10];
        int j = 0;
        for (String link : listaLinkFormatada) {
            links[j] = link;
            j++;
        }

        Pesquisa pesquisa;
        for (int z = 0; z < links.length; z++) {
            if (titulos[z] == null || links[z] == null) {
                break;
            }
            pesquisa = new Pesquisa();
            pesquisa.setTitulo(titulos[z]);
            pesquisa.setLink(links[z]);
            listaPesquisa.add(pesquisa);
        }

        return listaPesquisa;

    }
    
}
