/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.test.b5s.util;

import java.util.List;

/**
 *
 * @author user
 */
public class QuestionsB5s {

    /**
     * The function should recive an integer between 1 and 12 (inclusive) and
     * return the corresponding string value. If the informed integger is not
     * between 1 and 12, the function should return 'Unknown Month' Ex: input: 1
     * - output: "January" Ex: input: 13 - output: "Unknown Month"
     *
     * A função recebe um inteiro entre 1 e 12 e retorna o mês correspondente
     * por extenso. Caso o mês informado não esteja entre 1 e 12, deverá ser
     * retornado "Mes Inexistente" Ex: input: 1 - output: "Janeiro" Ex: input:
     * 13 - output: "Mês Desconhecido"
     */
    public String correspondingMonth(int month) {

        String stringMonth;

        switch (month) {
            case 1:
                stringMonth = "Janeiro";
                break;
            case 2:
                stringMonth = "Fevereiro";
                break;
            case 3:
                stringMonth = "Março";
                break;
            case 4:
                stringMonth = "Abril";
                break;
            case 5:
                stringMonth = "Maio";
                break;
            case 6:
                stringMonth = "Junho";
                break;
            case 7:
                stringMonth = "Julho";
                break;
            case 8:
                stringMonth = "Agosto";
                break;
            case 9:
                stringMonth = "Setembro";
                break;
            case 10:
                stringMonth = "Outubro";
                break;
            case 11:
                stringMonth = "Novembro";
                break;
            case 12:
                stringMonth = "Dezembro";
                break;
            default:
                stringMonth = "Mês Inexistente";

        }
        return stringMonth;
    }

    /**
     * The function should recive an array with at least 3 itens and return the
     * arithmetic average of all the itens. If the recived array contains less
     * then 3 itens, the function should return the boolean false. Ex: input:
     * [4,6,8] - output 6 Ex: input: [1,2] - output false
     *
     * A função deverá receber um array com pelo menos 3 itens e retornar a
     * média simples de todos os itens do array. Caso o array recebido possua
     * menos que 3 itens, deverá ser retornado o boleano false. Ex: input:
     * [4,6,8] - output 6 Ex: input: [1,2] - output false
     */
    public boolean arithmeticAverage(List<Integer> numeros) {

        if (numeros.size() >= 3) {
            System.out.println("A média aritmética de todos os itens do array é: " + calculateAverage(numeros));
            return true;
        }
        return false;
    }

    public int calculateAverage(List<Integer> numeros) {

        int numero = 0;
        int resultado;

        for (int x = 0; x < numeros.size(); x++) {
            numero += numeros.get(x);
        }

        resultado = numero / numeros.size();

        return resultado;
    }

}
