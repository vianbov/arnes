package com.vian.entityreservation.service;

import com.vian.entityreservation.model.Reservation;

import java.util.List;

public interface ReservationService {
    public Reservation saveReservation(Reservation Reservation);

    public List<Reservation> getAllReservations();

    public String deleteReservation(Integer id);
}
