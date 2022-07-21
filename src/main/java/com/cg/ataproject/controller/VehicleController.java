package com.cg.ataproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ataproject.model.Vehicle;
import com.cg.ataproject.service.VehicleService;

@RestController
@RequestMapping("/vehi")
public class VehicleController {

	@Autowired
	private VehicleService vehiService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	// http://localhost:9999/vehi/view-all-vehi
	@GetMapping("/view-all-vehi")
	public ResponseEntity<List<Vehicle>> viewAllVehicle() {
		List<Vehicle> vehicleList = vehiService.viewAllVehicle();
		for (Vehicle vehiTemp : vehicleList)
			LOG.info(vehiTemp.toString());
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Vehicle>> response = new ResponseEntity<>(vehicleList, status);
		return response;
	}

	// http://localhost:9999/vehi/view-vehi-by-id/{vehicleID}
	@GetMapping("/view-vehi-by-id/{vehicleID}")
	public ResponseEntity<Vehicle> viewVehicleById(@PathVariable(name = "vehicleID") int vehicleID) {
		LOG.info(Integer.toString(vehicleID));
		Vehicle vh = vehiService.viewVehicleById(vehicleID);
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Vehicle> response = new ResponseEntity<>(vh, status);
		return response;
	}

	// http://localhost:9999/vehi/add-vehi
	@PostMapping("/add-vehi")
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
		LOG.info(vehicle.toString());
		HttpStatus status = HttpStatus.CREATED;
		ResponseEntity<Vehicle> response = new ResponseEntity<>(vehiService.addVehicle(vehicle), status);
		return response;
	}

	// http://localhost:9999/vehi/modify-vehi
	@PutMapping("/modify-vehi")
	public ResponseEntity<Vehicle> modifyVehicle(@RequestBody Vehicle vehicle) {
		LOG.info(vehicle.toString());
		HttpStatus status = HttpStatus.CREATED;
		ResponseEntity<Vehicle> response = new ResponseEntity<>(vehiService.modifyVehicle(vehicle), status);
		return response;
	}

	// http://localhost:9999/vehi/delete-vehi
	@DeleteMapping("/delete-vehi/{vehicleId}")
	public ResponseEntity<Vehicle> deleteVehicle(@PathVariable(name = "vehicleId") int vehicleId) {
		LOG.info(Integer.toString(vehicleId));
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<Vehicle> response = new ResponseEntity<>(vehiService.deleteVehicle(vehicleId), status);
		return response;
	}

}




