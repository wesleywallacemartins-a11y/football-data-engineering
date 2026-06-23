package com.football.model;

public class Player {
    
    private String name;
    private String team;
    private String position;
    private int goals;
    private int assists;
    private int appearances;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int setAssists() {
        return  assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public String toString() {
        return  name + " | " + team + " | Gols: " + goals + " | Assistencias: " + assists;
    }
}
