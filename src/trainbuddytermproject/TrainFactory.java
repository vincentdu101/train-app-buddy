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
public abstract class TrainFactory {

	public Train prepareTrain(Direction direction, Station startingStation) {
		Train train = createTrain(direction);

		train.setupSeats();
		train.linkToStartingStation(startingStation);
		train.startTrain();

		return train;
	}

	abstract Train createTrain(Direction direction);
    
}
