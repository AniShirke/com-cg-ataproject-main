package com.cg.ataproject.service;

import java.util.List;
import com.cg.ataproject.model.Driver;

public interface IDriverService {
	
	public abstract List<Driver> viewAllDriver();

	public abstract Driver viewDriverById(int driverId);

	public abstract Driver modifyDriver(Driver driver);

	public abstract Driver deleteDriver(int driverId);
	
	public abstract Driver addDriver(Driver driver);
}
