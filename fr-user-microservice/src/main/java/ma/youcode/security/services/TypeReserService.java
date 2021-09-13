package ma.youcode.security.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.youcode.models.TypeReser;

@Service
public interface TypeReserService {
	public void addTypereservation(TypeReser typeReser);

	public void updateTypereservation(TypeReser typeReser);

	public List<TypeReser> listTypereservation();

	public TypeReser getTypereservationById(Long id);

	public void removeTypereservation(Long id);

}
