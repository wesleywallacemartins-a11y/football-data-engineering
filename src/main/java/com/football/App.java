package com.football;

import com.football.model.Match;
import com.football.model.Player;
import com.football.service.DataService;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Criando uma lista de partidas
        List<Match> partidas = new ArrayList<>();

        // Partida 1
        Match partida1 = new Match();
        partida1.setHomeTeam("Flamengo");
        partida1.setAwayTeam("Palmeiras");
        partida1.setHomeGoals(2);
        partida1.setAwayGoals(1);
        partida1.setLeague("Brasileirao Serie A");
        partidas.add(partida1);

        // Partida 2
        Match partida2 = new Match();
        partida2.setHomeTeam("Corinthians");
        partida2.setAwayTeam("Santos");
        partida2.setHomeGoals(0);
        partida2.setAwayGoals(0);
        partida2.setLeague("Brasileirao Serie A");
        partidas.add(partida2);

        // Partida 3
        Match partida3 = new Match();
        partida3.setHomeTeam("Gremio");
        partida3.setAwayTeam("Internacional");
        partida3.setHomeGoals(3);
        partida3.setAwayGoals(2);
        partida3.setLeague("Brasileirao Serie A");
        partidas.add(partida3);

        // Imprimindo todas as partidas
        System.out.println("=== PARTIDAS DO BRASILEIRAO ===");
        for (Match p : partidas) {
            System.out.println(p);
        }

        // Usando o DataService
        DataService servico = new DataService();
        int totalGols = servico.calcularTotalGols(partidas);
        String goleada = servico.encontrarMaiorGoleada(partidas);

        System.out.println("=== ANALISE ===");
        System.out.println("Total de gols: " + totalGols);
        System.out.println("Maior goleada: " + goleada);
        System.out.println("Total de partidas: " + partidas.size());
    }
}