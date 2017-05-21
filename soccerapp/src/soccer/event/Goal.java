/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer.event;

/**
 *
 * @author Anthony
 */
public class Goal extends GameEvent {
    
    public Goal() {
        
    }
    
    public String toString() {
        return "GOAL! ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new Kickoff()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
}
