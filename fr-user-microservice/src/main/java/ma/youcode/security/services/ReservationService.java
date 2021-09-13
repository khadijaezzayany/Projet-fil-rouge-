package ma.youcode.security.services;

import java.util.List;

import ma.youcode.models.Reservation;
import ma.youcode.models.User;

public interface ReservationService {

	List<Reservation> getReservationByUser(User user);

	Reservation updateReservation(long id);

	void deleteReservation(long id);
	
	Reservation createReservation (Reservation reservation);

	List<Reservation> getReservations(int page, int limit);
}
