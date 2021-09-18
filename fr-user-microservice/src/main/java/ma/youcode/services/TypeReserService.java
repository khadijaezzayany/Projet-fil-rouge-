package ma.youcode.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.youcode.models.TypeReser;

@Service
public interface TypeReserService {

	TypeReser  addTypereservation(TypeReser typeReser);

	TypeReser updateTypereservation( TypeReser typeReser);

	List<TypeReser> listTypereservation();

	public TypeReser getTypereservationById(Long id);

	public void removeTypereservation(Long id);

}
