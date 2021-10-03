package ma.youcode.servicesImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.youcode.models.Reservation;
import ma.youcode.models.TypeReser;
import ma.youcode.models.User;
import ma.youcode.repository.ReservationRepository;
import ma.youcode.repository.TypeReserRepository;
import ma.youcode.repository.UserRepository;
import ma.youcode.services.ReservationService;

@Service
public class ReservationServiceImp implements ReservationService {

	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	UserRepository userRepository;

	@Autowired
	TypeReserRepository typeReserRepository;

	@Override
	public List<Reservation>  getReservationByUser(String id) {
		User user = userRepository.findByUserId(id);
		List<Reservation> reservation = (List<Reservation>) reservationRepository.getReservationByUser(user);
		return reservation;

	}

	
	
	@Override
	public Reservation createReservation(Reservation reservation, String id, Long idType) {

		User user = userRepository.findByUserId(id);
		TypeReser typeReser = typeReserRepository.findTypeReserById(idType);

		if (user.equals(null) || typeReser.equals(null)) {
			return null;
		} else {
			reservation.setUser(user);
			reservation.setDateRes(new Date());
			reservation.setTypeRes(typeReser);
			reservationRepository.save(reservation);
			return reservation;

		}

	}
	
	
	
	
	@Override
	public Reservation updateReservation( Reservation reservation,Long id,Long idType) {
		TypeReser typeReser = typeReserRepository.findTypeReserById(idType);
		Reservation reservation2 = reservationRepository.findReservationById(id);

		if (typeReser.equals(null)) {
			return null;
		} else {
			

			reservation2.setTypeRes(reservation.getTypeRes());
			reservationRepository.save(reservation2);

			
			return reservation2;

		}

	}

	
	
	
	
	
	
	
	
	@Override
	public List<Reservation> getReservations() {
		return reservationRepository.findAll();
	}

	@Override
	public void deleteReservation(long id) {
		Reservation reservation = reservationRepository.getById(id);
		reservationRepository.delete(reservation);

	}



	@Override
	public Reservation getReservationById(Long id) {
		Reservation reservation = reservationRepository.findReservationById(id);
		return reservation;
	}



}
