/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

/**
 *
 * @author user
 */
//public class CustomSortDeserializer extends JsonDeserializer<Sort>{
//
//    @Override
//    public Sort deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
//        
//        ArrayNode node = jsonParser.getCodec().readTree(jsonParser);
//        Sort.Order[] orders = new Sort.Order[node.size()];
//        int i = 0;
//        for(JsonNode json : node){
//            orders[i] = new Sort.Order(Sort.Direction.valueOf(json.get("direction").asText()),
//                json.get("property").asText());
//            i++;
//        }
//        //List<Order> ordersLista = Arrays.asList(orders);
//        
//        return new Sort(orders);
//    }
//     
//}


//    Tive problemas com o retorno do sort. Parece que agora o sort não possui mais 
//as strings 'direction' e 'property'.
//    Mas colocando @JsonProperty("sort") JsonNode sort nos argumentos do construtor os dados 
//serão retornados ordenados. (Pelo menos nos testes que fiz a ordenação ocorreu sem problemas)
//    Como, ao que tudo indica, não existe mais o 'direction' e o 'property', eles consequentemente 
//não aparecem no body quando faz o debug.
