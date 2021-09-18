package ma.youcode.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.models.TypeReser;
import ma.youcode.servicesImp.TypeReserServiceImp;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/typereser")
public class TypeReserController {

	@Autowired
	TypeReserServiceImp typeReserService;

	@PostMapping("/addType")
	public ResponseEntity<TypeReser> save(@RequestBody TypeReser typeReser) {
		TypeReser newType = typeReserService.addTypereservation(typeReser);
		return new ResponseEntity<>(newType, HttpStatus.OK);

	}

	@DeleteMapping(path = "delete/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> deleteType(@PathVariable("id") Long id) throws IOException {
		System.out.println(id);
		typeReserService.removeTypereservation(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping(path ="find/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<TypeReser> getType(@PathVariable("id") Long id) {
		TypeReser type = typeReserService.getTypereservationById(id);
		return new ResponseEntity<>(type, HttpStatus.OK);
	}
	
	@PutMapping(path = "updateTpye",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<TypeReser> update(@PathVariable Long id, @RequestBody TypeReser typeReser){
		TypeReser newType = typeReserService.updateTypereservation(id, typeReser);
		return new ResponseEntity<>(newType,HttpStatus.ACCEPTED);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}	
		
		

