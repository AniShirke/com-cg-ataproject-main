package com.cg.ataproject.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ataproject.exception.VehicleNotFoundException;
import com.cg.ataproject.model.Vehicle;
import com.cg.ataproject.repository.DriverRepository;
import com.cg.ataproject.repository.RouteRepository;
import com.cg.ataproject.repository.VehicleRepository;

@Service
public class VehicleService implements IVehicleService {

	@Autowired
	VehicleRepository vehiRepository;

	@Autowired
	RouteService routeService;

	@Autowired
	RouteRepository routeRepository;

	@Autowired
	DriverService driverService;

	@Autowired
	DriverRepository driverRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Vehicle> viewAllVehicle() {
		LOG.info("viewAllVehicle");
		return vehiRepository.findAll();
	}

	public Vehicle viewVehicleById(int vehicleId) {
		Optional<Vehicle> vehiOptional = vehiRepository.findById(vehicleId);

		Vehicle vehi = null;
		if (vehiOptional.isPresent()) {
			vehi = vehiOptional.get();
			LOG.info(vehi.toString());
			return vehi;
		} else {
			String errorMessage = "vehicle with vehicleId " + vehicleId + " does not exist.";
			LOG.error(errorMessage);
			throw new VehicleNotFoundException(errorMessage);

		}

	}

	public Vehicle addVehicle(Vehicle vehicle) {
		LOG.info(vehicle.toString());
		if (vehicle.getRoute() != null)
		routeService.viewRouteById(vehicle.getRoute().getRouteId());
		driverService.viewDriverById(vehicle.getDriver().getDriverId()); 
		return vehiRepository.save(vehicle);
	}

	public Vehicle modifyVehicle(Vehicle vehicle) {
		LOG.info(vehicle.toString());
		this.viewVehicleById(vehicle.getVehicleId());
		return vehiRepository.save(vehicle);
	}

	public Vehicle deleteVehicle(int vehicleId) {
		LOG.info(Integer.toString(vehicleId));
		Vehicle vehiToDelete = this.viewVehicleById(vehicleId);
		vehiRepository.delete(vehiToDelete);
		return vehiToDelete;
	}

}