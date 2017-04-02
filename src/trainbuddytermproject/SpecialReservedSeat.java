/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainbuddytermproject;

/**
 *
 * @author vdu
 */
public class SpecialReservedSeat extends SeatDecorator {
    
    Seat seat;
    boolean taken;
    
    public SpecialReservedSeat() {
        this.taken = false;
        
    }
    
}
