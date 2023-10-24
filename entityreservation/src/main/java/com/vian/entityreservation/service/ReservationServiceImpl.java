package com.vian.entityreservation.service;

import com.vian.entityreservation.model.Reservation;
import com.vian.entityreservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation saveReservation(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public String deleteReservation(Integer id) {
        reservationRepository.deleteById(id);
        return "Deleted";
    }
}
