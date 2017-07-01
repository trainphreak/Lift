/*
 * This file is part of Lift.
 *
 * Copyright (c) ${project.inceptionYear}-2013, croxis <https://github.com/croxis/>
 *
 * Lift is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Lift is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Lift. If not, see <http://www.gnu.org/licenses/>.
 */
package net.croxis.plugins.lift;

import java.util.TreeMap;

public abstract class Elevator {

	//int destinationY = 0; //Destination y coordinate
	
	public boolean goingUp = false;
	public double speed = 0.5;
	private String failReason = "";
	public String cause = "";
	long startTime = 0;

	
	public TreeMap <Integer, Floor> floormap = new TreeMap<Integer, Floor>();//Index is y value
	public TreeMap <Integer, Floor> floormap2 = new TreeMap<Integer, Floor>();//Index is floor value
	
	public void clear(){
		floormap.clear();
		floormap2.clear();
	}

	void setStartTimeToNow () {
	    startTime = System.currentTimeMillis();
    }
	
	public Floor getFloorFromN(int n){
		return floormap2.get(n);
	}
	
	public Floor getFloorFromY(int y){
		return floormap.get(y);
	}
	
	public int getTotalFloors(){
		return floormap2.size();
	}
	
	public String getFailReason() {
		return failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	
	
}
