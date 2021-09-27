package ma.youcode.servicesImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javassist.expr.NewArray;
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
	public Reservation createReservation(Reservation reservation, String id, Long idType ) {

		User user = userRepository.findByUserId(id);
		TypeReser typeReser = typeReserRepository.findTypeReserById(idType);

		if(user.equals(null) || typeReser.equals(null))
		{
			return null;
		}
		else {
			reservation.setUser(user);
			reservation.setTypeRes(typeReser);
			reservationRepository.save(reservation);
			return reservation;

			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
