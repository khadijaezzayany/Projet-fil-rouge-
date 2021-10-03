package ma.youcode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ma.youcode.models.Reservation;
import ma.youcode.models.User;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

//	Optional<Reservation> findByTypeRes(TypeReser typeRes);

	@Query(value = "SELECT * FROM reservation WHERE user_id = ?", nativeQuery = true)
	List <Reservation> getReservationByUser(User user);

	Reservation findReservationById(Long id);

}
