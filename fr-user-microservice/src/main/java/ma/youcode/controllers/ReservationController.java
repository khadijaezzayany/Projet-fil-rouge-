package ma.youcode.controllers;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.models.Reservation;
import ma.youcode.models.TypeReser;
import ma.youcode.models.User;
import ma.youcode.repository.TypeReserRepository;
import ma.youcode.repository.UserRepository;
import ma.youcode.servicesImp.ReservationServiceImp;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ReservationServiceImp reservationService;
	
	@Autowired
	TypeReserRepository typeReserRepository;

//	@PreAuthorize("hasRole('ROLE_STUDENT')")
	@PostMapping("/addReservation/{id}/{idType}")
	public ResponseEntity<Reservation> addResarvation(@RequestBody Reservation reservation,@PathVariable String id, @PathVariable Long idType){
		
		
		Reservation reservation2  = reservationService.createReservation(reservation, id, idType);
		
		
		
		
		
		return new  ResponseEntity<Reservation>(reservation2,HttpStatus.ACCEPTED);
		
		
		
	}
	
	
	
	

}
