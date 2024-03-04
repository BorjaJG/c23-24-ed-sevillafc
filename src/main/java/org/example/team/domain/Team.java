package org.example.team.domain;

import org.example.player.domain.Player;

public class Team {


    public final String TeamID;
    public final String Name;
    public final String Category;
    public final Player player;


    public Team(String teamID, String name, String category, Player player) {
        TeamID = teamID;
        Name = name;
        Category = category;
        this.player = player;
    }

    public String getTeamID() {
        return TeamID;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "Team{" +
                "TeamID='" + TeamID + '\'' +
                ", Name='" + Name + '\'' +
                ", Category='" + Category + '\'' +
                ", player=" + player +
                '}';
    }
}
