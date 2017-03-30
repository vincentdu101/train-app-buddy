/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainbuddytermproject;

import java.util.List;

/**
 *
 * @author vincentdu
 */
public class Train {
    
    String description;
    String name;
    List<Seat> seats;
    Station startingStation;
    Station currentStation;
    
    public void setupSeats() {
        
    }
    
    public void linkToStartingStation(Station startingStation) {
        this.startingStation = startingStation;
    }
    
    public void startTrain() {
        
    }
}
