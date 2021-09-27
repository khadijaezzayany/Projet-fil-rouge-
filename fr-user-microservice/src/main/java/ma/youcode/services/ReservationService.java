package ma.youcode.services;

import java.util.List;

import org.springframework.security.core.Authentication;

import ma.youcode.models.Reservation;
import ma.youcode.models.User;

public interface ReservationService {

	List<Reservation> getReservationByUser(User user);

	Reservation updateReservation(long id);

	void deleteReservation(long id);
	
	Reservation createReservation (Reservation reservation, String  id, Long idType);

	List<Reservation> getReservations(int page, int limit);
}
