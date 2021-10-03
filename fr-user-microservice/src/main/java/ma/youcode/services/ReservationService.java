package ma.youcode.services;

import java.util.List;

import ma.youcode.models.Reservation;

public interface ReservationService {
	

	 List<Reservation> getReservationByUser(String id);

	Reservation updateReservation(Reservation reservation,Long id, Long idType);
	
	Reservation getReservationById(Long id);

	void deleteReservation(long id);
	
	Reservation createReservation (Reservation reservation, String  id, Long idType);

	List<Reservation> getReservations();
}
