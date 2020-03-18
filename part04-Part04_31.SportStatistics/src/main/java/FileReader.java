
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woohoo
 */
public class FileReader {

    private String fileName;
    private List<Team> teams;

    public FileReader(String fileName) {
        this.fileName = fileName;
        this.teams = new ArrayList<>();
    }

    public void readFile() {
        try (Scanner s = new Scanner(Paths.get(this.fileName))) {
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] parts = line.split(",");
                determineResult(parts);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void determineResult(String[] parts) {
        String nameOfFirstTeam = parts[0];
        String nameOfSecondTeam = parts[1];
        int scoreOfFirstTeam = Integer.valueOf(parts[2]);
        int scoreOfSecondTeam = Integer.valueOf(parts[3]);
        if (scoreOfFirstTeam > scoreOfSecondTeam) {
            adjustWinningTeam(nameOfFirstTeam);
            adjustLosingTeam(nameOfSecondTeam);
        } else {
            adjustWinningTeam(nameOfSecondTeam);
            adjustLosingTeam(nameOfFirstTeam);
        }
    }

    private void adjustWinningTeam(String nameOfTeam) {
        Team theTeam = getTeam(nameOfTeam);
        theTeam.incrementGames();
        theTeam.incrementWins();
    }

    private void adjustLosingTeam(String nameOfTeam) {
        Team theTeam = getTeam(nameOfTeam);
        theTeam.incrementGames();
        theTeam.incrementLosses();
    }

    public Team getTeam(String teamName) {
        for (Team aTeam : this.teams) {
            if (aTeam.getTeamName().equals(teamName)) {
                return aTeam;
            }
        }
        Team t = new Team(teamName);
        this.teams.add(t);
        return t;
    }

}
