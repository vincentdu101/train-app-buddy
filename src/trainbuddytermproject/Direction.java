/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainbuddytermproject;

/**
 *
 * @author vincentdu
 */
public enum Direction {
    
    NORTH("North bound"),
    SOUTH("South bound");
    
    String direction;
    
    Direction(String direction) {
        this.direction = direction;
    }
    
    public String getDirection() {
        return direction;
    }
}
