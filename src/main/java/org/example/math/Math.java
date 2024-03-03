package org.example.math;

public class Math {


    public final String matchID ;
    public final String localTeam;
    public final String visitor;
    public final String referee;
    public final String result;
    public final String  matchDate;

    public Math(String matchID, String localTeam, String visitor, String referee, String result, String matchDate) {
        this.matchID = matchID;
        this.localTeam = localTeam;
        this.visitor = visitor;
        this.referee = referee;
        this.result = result;
        this.matchDate = matchDate;
    }

    public String getMatchID() {
        return matchID;
    }

    public String getLocalTeam() {
        return localTeam;
    }

    public String getVisitor() {
        return visitor;
    }

    public String getReferee() {
        return referee;
    }

    public String getResult() {
        return result;
    }

    public String getMatchDate() {
        return matchDate;
    }

    @Override
    public String toString() {
        return "Math{" +
                "matchID='" + matchID + '\'' +
                ", localTeam='" + localTeam + '\'' +
                ", visitor='" + visitor + '\'' +
                ", referee='" + referee + '\'' +
                ", result='" + result + '\'' +
                ", matchDate='" + matchDate + '\'' +
                '}';
    }
}
