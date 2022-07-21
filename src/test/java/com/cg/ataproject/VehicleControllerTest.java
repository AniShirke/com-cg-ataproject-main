package com.cg.ataproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.ataproject.controller.VehicleController;

@SpringBootTest
public class VehicleControllerTest {

	@Autowired
	VehicleController vehController;

	@Test
	public void testGetVehicleById() {
		assertEquals(1, vehController.viewVehicleById(1).getBody().getVehicleId());

	}

	@Test
	@Disabled
	public void testGetVehicleById2() {
		assertNotEquals(1, vehController.viewVehicleById(2));
	}
}
