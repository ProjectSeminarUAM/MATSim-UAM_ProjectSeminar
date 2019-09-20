package net.bhl.matsim.uam.dispatcher;

import net.bhl.matsim.uam.infrastructure.UAMVehicle;
import net.bhl.matsim.uam.passenger.UAMRequest;

/**
 * Interface for the UAM Dispatchers.
 * 
 * @author balacmi (Milos Balac), RRothfeld (Raoul Rothfeld)
 *
 */
public interface Dispatcher {

	/**
	 * @param request UAM Request
	 * 
	 *                Method that manages a new request
	 */
	void onRequestSubmitted(UAMRequest request);

	/**
	 * @param vehicle UAM Vehicle
	 * 
	 *                Method that prepares the UAM Vehicle for the next task
	 */
	void onNextTaskStarted(UAMVehicle vehicle);

	/**
	 * @param simulationTime Simulation time
	 * 
	 *                       Method used for any change to be performed before the
	 *                       next simulation step
	 */
	void onNextTimeStep(double simulationTime);

}