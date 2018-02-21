package rcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rcl.model.Contact;
import rcl.repository.ContactRepository;

@RestController
@RequestMapping("/contactList/api")
public class ContactController {

	@Autowired
	private ContactRepository contactRepo;

	@GetMapping("/contacts/{id}")
	public ResponseEntity<Contact> contact(@PathVariable("id") Long contactId) {
		return ResponseEntity.ok(contactRepo.findOne(contactId));

	}
	
	@GetMapping("/contacts")
	public List<Contact> allContacts(){
		return contactRepo.findAll();
	}
	
	@GetMapping("/addContacts")
	public String addContacts() {
		
		Contact testContact = new Contact()
		.setNameTitle("Mr.")
		.setFirstName("Fredy")
		.setMiddleInitial('A')
		.setLastName("Teyssedou")
		.setCompanyName("Subway")
		.setAddressOne("310 Dyer St.")
		.setAddressTwo("APT 3L")
		.setCityName("New Haven")
		.setStateName("CT")
		.setZipCode(06515)
		.setCountry("United States")
		.setPhoneNumber(2035359518);
		
		
		contactRepo.save(testContact);
		
		
		return "ok";
	}

}

