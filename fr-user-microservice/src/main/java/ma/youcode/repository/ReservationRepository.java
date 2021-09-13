package ma.youcode.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.youcode.models.Reservation;
import ma.youcode.models.TypeReser;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	Optional<Reservation> findByTypeRes(TypeReser typeRes);
	
	

}
