package com.football.service;

import java.util.List;

import com.football.model.Match;

public class DataService {
    
    public int calcularTotalGols(List<Match> partidas) {
        int total = 0;
        for (Match p : partidas) {
            total = total + p.getHomeGoals() + p.getAwayGoals();
        }
        return  total;
    }
    public String encontrarMaiorGoleada(List<Match> partidas) {
        Match maior = null;
        int maiorDiferenca = 0;

        for (Match p : partidas) {
            int diferenca = p.getHomeGoals() - p.getAwayGoals();
            if (diferenca < 0) {
                diferenca = diferenca * -1;
            }
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                maior = p;
            }
        }
        if (maior == null) {
            return "Nenhuma partida encontrada";
        }
        return maior.toString();
    }
}
