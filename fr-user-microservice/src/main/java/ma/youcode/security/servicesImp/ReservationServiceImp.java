package ma.youcode.security.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.youcode.models.Reservation;
import ma.youcode.models.User;
import ma.youcode.repository.ReservationRepository;
import ma.youcode.security.services.ReservationService;

@Service
public class ReservationServiceImp implements ReservationService {


	@Autowired
	ReservationRepository reservationRepository;
	
	
	
	
	
	
	
	
	@Override
	public List<Reservation> getReservationByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getReservations(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation updateReservation(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReservation(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reservation createReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

}
