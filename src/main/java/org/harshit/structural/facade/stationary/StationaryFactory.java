package org.harshit.structural.facade.stationary;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
