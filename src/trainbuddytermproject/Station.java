/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainbuddytermproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vincentdu
 */
public abstract class Station {
    
    String description = "Train Station";
    boolean trainStationed = false;
    List<Monitor> monitors;
    
    public String getDescription() {
        return description;
    }
    
    public abstract Station nextNorthStation();
    
    public abstract Station nextSouthStation();
    
    public abstract void trainArrived();
    
    public abstract void trainLeft();
    
    public abstract void trainNotification();
    
}
