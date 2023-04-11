
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<MatchLine> arrayFileList = new ArrayList<>();
        
        
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        
        System.out.println("File:");
        String fileNameInput = scan.nextLine();
        
        try(Scanner scanner = new Scanner(Paths.get(fileNameInput))){
            while(scanner.hasNextLine()){
                
                String fileText = scanner.nextLine();
                String[] fileTextSplitter = fileText.split(",");
                String homeTeam = fileTextSplitter[0];
                String visitingTeam = fileTextSplitter[1];
                int homeTeamPts = Integer.valueOf(fileTextSplitter[2]);
                int visitingTeamPts = Integer.valueOf(fileTextSplitter[3]);
                
                arrayFileList.add(new MatchLine(homeTeam, visitingTeam, homeTeamPts, visitingTeamPts));
                
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        System.out.println("Team:");
        String teamNameInput = scan.nextLine();
        
        for(MatchLine arrayfile:arrayFileList){
            
            if(arrayfile.getHomeTeam().equals(teamNameInput) || 
               arrayfile.getVisitingTeam().equals(teamNameInput)){
                gamesPlayed++;
            }
            if((arrayfile.getHomeTeam().equals(teamNameInput) && 
                arrayfile.getHomeTeamPts() > arrayfile.getVisitingTeamPts())
                || (arrayfile.getVisitingTeam().equals(teamNameInput) && 
                arrayfile.getHomeTeamPts() < arrayfile.getVisitingTeamPts())){
                
                wins++;
            } else if((arrayfile.getHomeTeam().equals(teamNameInput) && 
                arrayfile.getHomeTeamPts() < arrayfile.getVisitingTeamPts())
                || (arrayfile.getVisitingTeam().equals(teamNameInput) && 
                arrayfile.getHomeTeamPts() > arrayfile.getVisitingTeamPts())){
                
                losses++;
            }
        }
        
        System.out.println("Games: "+gamesPlayed);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
        
        
    }
}
