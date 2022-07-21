package com.cg.ataproject.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "booking_table")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	//@Column(name = "bookingDate")
	//private LocalDate bookingDate;
    @JsonFormat(pattern="mm-dd-yyyy")
    private Date bookingDate;

	//@Column(name = "journeyDate")
    @JsonFormat(pattern="mm-dd-yyyy")
	private Date journeyDate;

	@Column(name = "boardingPoint")
	private String boardingPoint;

	@Column(name = "dropPoint")
	private String dropPoint;

	@Column(name = "source")
	private String source;

	@Column(name = "noOfPassenger")
	private int noOfPassenger;

	@Column(name = "bookingStatus")
	private String bookingStatus;
	
	

	public Booking() {
		super();
	}

	public Booking(int bookingId, Date bookingDate) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
	}

	public Booking(int bookingId, Date bookingDate, Date journeyDate) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
	}

	public Booking(int bookingId, Date bookingDate, Date journeyDate, String boardingPoint) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
	}

	public Booking(int bookingId, Date bookingDate, Date journeyDate, String boardingPoint,
			String dropPoint) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
	}

	public Booking(int bookingId, Date bookingDate, Date journeyDate, String boardingPoint, String dropPoint,
			String source) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.source = source;
	}

	public Booking(int bookingId, Date bookingDate, Date journeyDate, String boardingPoint, String dropPoint,
			String source, int noOfPassenger) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.source = source;
		this.noOfPassenger = noOfPassenger;
	}

	public Booking(int bookingId, Date bookingDate, Date journeyDate, String boardingPoint, String dropPoint,
			String source, int noOfPassenger, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.source = source;
		this.noOfPassenger = noOfPassenger;
		this.bookingStatus = bookingStatus;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", journeyPoint=" + journeyDate
				+ ", journeyDate=" + journeyDate + ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint
				+ ", source=" + source + ", noOfPassenger=" + noOfPassenger + ", bookingStatus=" + bookingStatus + "]";
	}

}
