package ma.youcode.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.youcode.models.TypeReser;
import ma.youcode.repository.TypeReserRepository;
import ma.youcode.services.TypeReserService;

@Service
public class TypeReserServiceImp implements TypeReserService {
	
	@Autowired
	TypeReserRepository typeReserRepository;

	
	@Override
	public TypeReser addTypereservation(TypeReser typeReser) {
		return typeReserRepository.save(typeReser);
	}

	@Override
	public TypeReser getTypereservationById(Long id) {
		return typeReserRepository.findTypeReserById(id);
		
	}

	@Override
	public void removeTypereservation(Long id) {
		TypeReser typeReser = typeReserRepository.getById(id);
		System.out.println(typeReser.getId());
		typeReserRepository.deleteById(typeReser.getId());	
	}

	
	
	
	
	@Override
	public List<TypeReser> listTypereservation() {
		return typeReserRepository.findAll();
	}

	
	
	@Override
	public TypeReser updateTypereservation(Long id, TypeReser typeReser) {
		TypeReser typeReserModel = typeReserRepository.findTypeReserById(id);
		typeReserModel.setTypeRes(typeReser.getTypeRes());
		typeReserModel.setNomberPlaces(typeReser.getNomberPlaces());
		typeReserRepository.save(typeReserModel);
		return typeReserModel;
	}




}
