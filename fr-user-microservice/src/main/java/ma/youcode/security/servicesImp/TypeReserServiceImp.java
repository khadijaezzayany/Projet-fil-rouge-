package ma.youcode.security.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.youcode.models.TypeReser;
import ma.youcode.repository.TypeReserRepository;
import ma.youcode.security.services.TypeReserService;

public class TypeReserServiceImp implements TypeReserService {
	
	@Autowired
	TypeReserRepository typeReserRepository;

	@Override
	public void addTypereservation(TypeReser typeReser) {
		typeReserRepository.save(typeReser);

		
	}

	@Override
	public void updateTypereservation(TypeReser typeReser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TypeReser> listTypereservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeReser getTypereservationById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTypereservation(Long id) {
		// TODO Auto-generated method stub
		
	}

}
