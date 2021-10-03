package ma.youcode.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.models.Reservation;
import ma.youcode.models.User;
import ma.youcode.repository.ReservationRepository;
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
	
	@Autowired
	ReservationRepository reservationRepository;
	
	

	//////////////////////////////////  add Reservations By User
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	@PostMapping("/addReservation/{id}/{idType}")
	public ResponseEntity<Reservation> addResarvation(@RequestBody Reservation reservation, @PathVariable String id,
			@PathVariable Long idType) {
		Reservation reservation2 = reservationService.createReservation(reservation, id, idType);

		return new ResponseEntity<Reservation>(reservation2, HttpStatus.ACCEPTED);

	}
	
	
	
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	@PutMapping(path="/update/{id}/{idType}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Reservation> update(@RequestBody Reservation reservation,@PathVariable Long id,@PathVariable Long idType){
		Reservation reservation2 = reservationService.updateReservation(reservation, id, idType);
		return new ResponseEntity<Reservation>(reservation2, HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////   List Of Reservations
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(path= "/listAllRservation",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Reservation>> getAllReservation(){
		List<Reservation> reservation = reservationService.getReservations();
		return new ResponseEntity<List<Reservation>>(reservation,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////    List Of Reservations By User
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	@GetMapping(path = "/listAllRservation/{id}",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity <List<Reservation>> getAllReservationByUser(@PathVariable String id){
		User user = userRepository.findByUserId(id);
		List<Reservation> reservation = reservationService.getReservationByUser(id);
		return new ResponseEntity<List<Reservation>>(reservation,HttpStatus.OK);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	@DeleteMapping(path = "/delete/{id}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> deleteType(@PathVariable("id") Long id) throws IOException {
		reservationService.deleteReservation(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	@GetMapping(path="/find/{id}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Reservation> getById(@PathVariable("id") Long id){
		Reservation reservation = reservationService.getReservationById(id);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}
	




}
