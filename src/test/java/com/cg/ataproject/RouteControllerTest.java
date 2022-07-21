package com.cg.ataproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.ataproject.controller.RouteController;




@SpringBootTest
public class RouteControllerTest {

	@Autowired
	RouteController rootController;

	@Test
	public void testGetRouteById() {
		assertEquals(1, rootController.viewRouteById(1).getBody().getRouteId());
		
	}
	
	@Test
	@Disabled
	public void testGetRouteById3() {
		assertNotEquals(1, rootController.viewRouteById(2));
	}
	
}