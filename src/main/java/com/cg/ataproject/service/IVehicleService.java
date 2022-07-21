package com.cg.ataproject.service;

import java.util.List;

import com.cg.ataproject.model.Vehicle;

public interface IVehicleService {
	
	public abstract List<Vehicle> viewAllVehicle();

	public abstract Vehicle viewVehicleById(int vehicleId);

	public abstract Vehicle addVehicle(Vehicle vehicle);

	public abstract Vehicle modifyVehicle(Vehicle vehicle);
	
	public abstract Vehicle deleteVehicle(int vehicleId);
}
