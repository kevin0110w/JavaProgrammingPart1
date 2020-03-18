/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woohoo
 */
public class Team {

    private String teamName;
    private int games;
    private int wins;
    private int losses;

    public Team(String teamName) {
        this.teamName = teamName;
        this.games = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void incrementGames() {
        this.games++;
    }

    public void incrementWins() {
        this.wins++;
    }

    public void incrementLosses() {
        this.losses++;
    }

    @Override
    public String toString() {
        return "Games: " + this.games + "\nWins: " + this.wins + "\nLosses: " + this.losses;
    }
}
