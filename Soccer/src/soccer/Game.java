/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Anthony
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    }
    
    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }
    
    public void playGame() {
        ArrayList <GameEvent> eventList = new ArrayList();
        GameEvent currEvent;
        
        for (int i = 1; i <= 90; i++) {
            /* Practice 13-1. Change expression to Math.random > 0.8 */
            if (Math.random() > 0.99) {
                currEvent = Math.random() > 0.6 ? new Goal() : new Possession();
                /* Practice 13-1. Change first part of ternary operator to Math.random > 0.8 */
                currEvent.setTheTeam(Math.random() > 0.5 ? homeTeam : awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().
                        getPlayerArray()[(int)(Math.random() * currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
                //System.out.println(i);
            }
            this.goals = new GameEvent[eventList.size()];
            eventList.toArray(goals);
        }
    }
    
    public String getDescription() {
        
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(this.getHomeTeam().getTeamName() + " vs. " +
                this.getAwayTeam().getTeamName() + "\n" +
                "Date: " + this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
        
        
        for (GameEvent currEvent: this.getEvents()) {
            /* Practice 13-1. Start if block here to determine if currEvent is a Goal */
            if (currEvent instanceof Goal) {
                if (currEvent.getTheTeam() == homeTeam) {
                    homeTeamGoals++;
                    homeTeam.incGoalsTotal(1);
                } else {
                    awayTeamGoals++;
                    awayTeam.incGoalsTotal(1);
                }
            }
            /* Practice 13-1. End if block here to determine if currEvent is a Goal */
        }
    }
}
