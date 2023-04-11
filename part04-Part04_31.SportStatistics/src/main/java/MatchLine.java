/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class MatchLine {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPts;
    private int visitingTeamPts;
    
    public MatchLine(String homeTeam, String visitingTeam, int homeTeamPts, int visitingTeamPts){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPts = homeTeamPts;
        this.visitingTeamPts = visitingTeamPts;
    }
    
    public String getHomeTeam(){
        return homeTeam;
    }
    
    public String getVisitingTeam(){
        return visitingTeam;
    }
    
    public int getHomeTeamPts(){
        return homeTeamPts;
    }
    
    public int getVisitingTeamPts(){
        return visitingTeamPts;
    }
    
}
