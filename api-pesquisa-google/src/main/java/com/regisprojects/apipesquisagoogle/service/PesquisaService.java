/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.apipesquisagoogle.service;

import com.google.gson.Gson;
import com.regisprojects.apipesquisagoogle.model.Pesquisa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author user
 */
@Service
public class PesquisaService {

    private String urlString = "https://www.google.com/search?q=";

    public String getConnection(String parametroDeBusca) {

        String url = urlString + parametroDeBusca;

        try {

            Document doc = Jsoup.connect(url).get();

            Elements links = doc.select("div.TbwUpd.NJjxre");
            Elements titulos = doc.select("h3.LC20lb.DKV0Md span:nth-child(1)");

//            System.out.println("Link:");
            List<String> listaLinks = new ArrayList<>();
            for (Element el : links) {
//                System.out.println(el.text());
                listaLinks.add(el.text());
            }
//            System.out.println(listaLinks);

            String formater;
            List<String> listaLinkFormatada = new ArrayList<>();
            for (String link : listaLinks) {
                formater = link.trim();
                formater = formater.replaceAll(" ", "");
                formater = formater.replaceAll("›", "/");
                link = formater;
                listaLinkFormatada.add(link);
            }
//            System.out.println(listaLinks);
//            System.out.println(listaLinkFormatada);
//            
//            System.out.println("Título:");

            List<String> listaTitulos = new ArrayList<>();
            for (Element el : titulos) {
//                System.out.println(el.text());
                listaTitulos.add(el.text());
            }
//            System.out.println(listaTitulos);

            List<Pesquisa> listaPesquisa = populaListaPesquisa(listaTitulos, listaLinkFormatada);
            String json = converteListaPesquisaParaJson(listaPesquisa);

            return json;
        
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
        System.out.println(Arrays.toString(titulos));

        String[] links = new String[10];
        int j = 0;
        for (String link : listaLinkFormatada) {
            links[j] = link;
            j++;
        }
        System.out.println(Arrays.toString(links));

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
        System.out.println(listaPesquisa);

        for (Pesquisa p : listaPesquisa) {
            System.out.println(p.getLink());
            System.out.println(p.getTitulo());
        }

        return listaPesquisa;

    }

    private String converteListaPesquisaParaJson(List<Pesquisa> listaPesquisa) {

        Gson gson = new Gson();
        String listJson = gson.toJson(listaPesquisa);

        System.out.println(listJson);
        return listJson;
    }

}
