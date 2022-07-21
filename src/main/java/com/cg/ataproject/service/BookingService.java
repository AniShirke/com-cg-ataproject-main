package com.cg.ataproject.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ataproject.exception.BookingNotFoundException;
import com.cg.ataproject.model.Booking;
import com.cg.ataproject.repository.BookingRepository;

@Service
public class BookingService implements IBookingService {

	@Autowired(required = true)
	BookingRepository bookRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Booking> viewAllBooking() {
		LOG.info("viewAllBooking");
		return bookRepository.findAll();
	}

	public Booking viewBookingById(int bookingId) {
		Optional<Booking> bokOptional = bookRepository.findById(bookingId);
		Booking booking = null;
		if (bokOptional.isPresent()) {
			booking = bokOptional.get();
			LOG.info(booking.toString());
			return booking;
		} else {
			String errorMessage = "Booking with booking " + bookingId + " does not exist.";
			LOG.error(errorMessage);
			throw new BookingNotFoundException(errorMessage);
		}
	}

	public Booking addBooking(Booking booking) {
		LOG.info(booking.toString());
		return bookRepository.save(booking);
	}

	public Booking modifyBooking(Booking booking) {
		LOG.info(booking.toString());
		this.viewBookingById(booking.getBookingId());
		return bookRepository.save(booking);
	}

	public Booking cancelBooking(int bookingId) {
		LOG.info(Integer.toString(bookingId));
		Booking bokToDelete = this.viewBookingById(bookingId);
		bookRepository.delete(bokToDelete);
		return bokToDelete;
	}

}
