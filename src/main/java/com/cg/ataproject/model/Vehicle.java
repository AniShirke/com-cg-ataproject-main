package com.cg.ataproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_table")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;
	
	@Column(name="vehicleNo")
	private String vehicleNo;
     
	@Column(name = "vehicleName")
	private String vehicleName;

	@Column(name = "vehicleType")
	private String vehicleType;

	@Column(name = "vehicleSeatingCapacity")
	private int vehicleSeatingCapacity;

	@Column(name = "farePerKM")
	private double farePerKM;

	@ManyToOne
	@JoinColumn(name = "Fk_routeId")
	private Route route;

	@OneToOne
	@JoinColumn(name = "FK_driverId")
	private Driver driver;

	public Vehicle() {
		super();

	}

	public Vehicle(int vehicleId, String vehicaleName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicaleName;
	}

	public Vehicle(int vehicleID, String vehicaleName, String vehicleType) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
	}

	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}

	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity,
			double farePerKM) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;
	}

	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity, double farePerKM,
			Driver driver) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;

	}

	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity, double farePerKM,
			com.cg.ataproject.model.Route route) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;
		this.route = route;
	}

	public Vehicle(int vehicleId, String vehicleNo, String vehicleName, String vehicleType, int vehicleSeatingCapacity,
			double farePerKM, Route route, Driver driver) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;
		this.route = route;
		this.driver = driver;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleID) {
		this.vehicleId = vehicleID;
	}

	public String getVehicaleName() {
		return vehicleName;
	}

	public void setVehicaleName(String vehicaleName) {
		this.vehicleName = vehicaleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getVehicleSeatingCapacity() {
		return vehicleSeatingCapacity;
	}

	public void setVehicleSeatingCapacity(int vehicleSeatingCapacity) {
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}

	public double getFarePerKM() {
		return farePerKM;
	}

	public void setFarePerKM(double farePerKM) {
		this.farePerKM = farePerKM;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleNo=" + vehicleNo + ", vehicleName=" + vehicleName
				+ ", vehicleType=" + vehicleType + ", vehicleSeatingCapacity=" + vehicleSeatingCapacity + ", farePerKM="
				+ farePerKM + ", route=" + route + ", driver=" + driver + "]";
	}



}
