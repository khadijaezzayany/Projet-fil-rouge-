package ma.youcode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.models.TypeReser;
import ma.youcode.repository.TypeReserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/typereser")
public class TypeReserController {

	@Autowired
	TypeReserRepository typeReserRepository;

	@PostMapping("/add")
	private Long savetype(@RequestBody TypeReser ty) {
		typeReserRepository.save(ty);
		return ty.getId();

	}

}
