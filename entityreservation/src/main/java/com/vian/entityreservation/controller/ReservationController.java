package com.vian.entityreservation.controller;

import com.vian.entityreservation.model.Reservation;
import com.vian.entityreservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@CrossOrigin
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/add")
    public String add(@RequestBody Reservation Reservation){
        reservationService.saveReservation(Reservation);
        return "New Entity is added";
    }

    @GetMapping("/getAll")
    public List<Reservation> list(){
        return reservationService.getAllReservations();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return reservationService.deleteReservation(id);
    }
}
