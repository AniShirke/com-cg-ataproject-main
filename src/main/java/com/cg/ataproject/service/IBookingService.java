package com.cg.ataproject.service;

import java.util.List;
import com.cg.ataproject.model.Booking;

public interface IBookingService {
	
	public abstract List<Booking> viewAllBooking();

	public abstract Booking viewBookingById(int bookingId);

	public abstract Booking addBooking(Booking booking);

	public abstract Booking modifyBooking(Booking booking);
	
	public abstract Booking cancelBooking(int bookingId);
}
