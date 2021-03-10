/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.apipesquisagoogle.service;

import com.regisprojects.apipesquisagoogle.model.Pesquisa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.tomcat.util.json.JSONParser;
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

    private List<Pesquisa> resultados = new ArrayList();
    private String urlString = "https://www.google.com/search?q=";

    public void getConnection(String parametroDeBusca) {

        String url = urlString + parametroDeBusca;

        try {

            Document doc = Jsoup.connect(url).get();

            Elements elementosTag = doc.select("div.TbwUpd.NJjxre");
            Elements elementosTag1 = doc.select("h3.LC20lb.DKV0Md span:nth-child(1)");
            
            System.out.println("Link:");

            for (Element el : elementosTag) {
                System.out.println(el.text());
            }
            
            System.out.println("Título:");

            for (Element el : elementosTag1) {
                System.out.println(el.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
