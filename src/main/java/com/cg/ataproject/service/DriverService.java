package com.cg.ataproject.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ataproject.exception.DriverNotFoundException;
import com.cg.ataproject.model.Driver;
import com.cg.ataproject.repository.DriverRepository;

@Service
public class DriverService implements IDriverService {

	@Autowired(required = true)
	DriverRepository driveRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Driver> viewAllDriver() {
		LOG.info("viewAllDriver");
		return driveRepository.findAll();
	}

	public Driver viewDriverById(int driverId) {
		Optional<Driver> driOptional = driveRepository.findById(driverId);
		Driver dri = null;
		if (driOptional.isPresent()) {
			dri = driOptional.get();
			LOG.info(dri.toString());
			return dri;
		} else {
			String errorMessage = "Driver with driver " + driverId + " does not exist.";
			LOG.error(errorMessage);
			throw new DriverNotFoundException(errorMessage);
		}
	}

	public Driver addDriver(Driver driver) {
		LOG.info(driver.toString());
		return driveRepository.save(driver);
	}

	public Driver modifyDriver(Driver driver) {
		LOG.info(driver.toString());
		this.viewDriverById(driver.getDriverId());
		return driveRepository.save(driver);
	}

	public Driver deleteDriver(int driverId) {
		LOG.info(Integer.toString(driverId));
		Driver driverToDelete = this.viewDriverById(driverId);
		driveRepository.delete(driverToDelete);
		return driverToDelete;
	}

}
