package com.cg.ataproject.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(BookingNotFoundException.class)
	public ResponseEntity<Object> handleBookingNotFoundException(BookingNotFoundException e) {
		String exceptionMessage = e.getMessage();
		LOG.error(exceptionMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("exceptionMessage", exceptionMessage);
		ResponseEntity<Object> response = new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
		return response;
	}

	@ExceptionHandler(RouteNotFoundException.class)
	public ResponseEntity<Object> handleRouteNotFoundException(RouteNotFoundException e) {
		String exceptionMessage = e.getMessage();
		LOG.error(exceptionMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("exceptionMessage", exceptionMessage);
		ResponseEntity<Object> response = new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
		return response;
	}

	@ExceptionHandler(AppUserNotFoundException.class)
	public ResponseEntity<Object> handleAppUserNotFoundException(AppUserNotFoundException e) {
		String exceptionMessage = e.getMessage();
		LOG.error(exceptionMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("exceptionMessage", exceptionMessage);
		ResponseEntity<Object> response = new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
		return response;
	}

	@ExceptionHandler(DriverNotFoundException.class)
	public ResponseEntity<Object> handleDriverNotFoundException(DriverNotFoundException e) {
		String exceptionMessage = e.getMessage();
		LOG.error(exceptionMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("exceptionMessage", exceptionMessage);
		ResponseEntity<Object> response = new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
		return response;
	}

	@ExceptionHandler(VehicleNotFoundException.class)
	public ResponseEntity<Object> handleVehicleNotFoundException(VehicleNotFoundException e) {
		String exceptionMessage = e.getMessage();
		LOG.error(exceptionMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("exceptionMessage", exceptionMessage);
		ResponseEntity<Object> response = new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
		return response;
	}

}