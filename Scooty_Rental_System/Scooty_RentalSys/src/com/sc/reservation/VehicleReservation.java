package com.sc.reservation;

import java.time.LocalDateTime;

import com.sc.rental.modal.common.Address;

public class VehicleReservation {
	 private String reservationId;
	    private String usrId;
	    private LocalDateTime reservationDate;
	    private LocalDateTime fromDate;
	    private LocalDateTime dueDate;
	    private LocalDateTime returnDate;
	    private Address pickupLocation;
	    private Address dropLocation;
	    private double startMileage;
	    private double endMileage;
	    private String accocatedVehicleId;
	    private String invoiceId;
	   

}
