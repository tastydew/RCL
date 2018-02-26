package rcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import rcl.controller.exceptions.NotFoundException;
import rcl.model.Contact;
import rcl.repository.ContactRepository;

@RestController
@RequestMapping("/contactList/api")
public class ContactController {

	@Autowired
	private ContactRepository contactRepo;

	@GetMapping("/contacts/{id}")
	public Optional<Contact> contact(@PathVariable("id") Long contactId) {
		return contactRepo.findById(contactId);

	}

	 @GetMapping("/contacts")
	 public List<Contact> allContacts() {
	 return contactRepo.findAll();
	 }

	@PostMapping("/contacts")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Contact> addContacts(@RequestBody List<Contact> newContact) {
		return contactRepo.saveAll(newContact);
	}

	@GetMapping(value = "/contacts")
	@ResponseStatus(HttpStatus.OK)
	public List<Contact> getContactByFirstName(@RequestParam("firstName") String name,
			@RequestParam("lastName") String lastName) {

		Contact contact = new Contact().setFirstName(name).setLastName(lastName);
		Example<Contact> ex = Example.of(contact);
		return contactRepo.findAll(ex);
	}

	@DeleteMapping("/contacts/{id}")
	public void deleteContact(@PathVariable long id) {
		contactRepo.deleteById(id);
	}

	@PutMapping("/contacts/{id}")
	public Contact updateContact(@PathVariable long id, @RequestBody Contact contact) throws NotFoundException {

		Optional<Contact> contactId = contactRepo.findById(id);
		if (contactId.isPresent()) {
			Contact updatedContact = contactId.get();
			updatedContact.setNameTitle(contact.getNameTitle()).setFirstName(contact.getFirstName())
					.setMiddleInitial(contact.getMiddleInitial()).setLastName(contact.getLastName())
					.setCompanyName(contact.getCompanyName()).setAddressOne(contact.getAddressOne())
					.setAddressTwo(contact.getAddressTwo()).setCityName(contact.getCityName())
					.setStateName(contact.getStateName()).setZipCode(contact.getZipCode())
					.setCountry(contact.getCountry()).setPhoneNumber(contact.getPhoneNumber());
			return contactRepo.save(updatedContact);
		}
		
		throw new NotFoundException("Could not find contact with ID: " + id);
		

	}

}
