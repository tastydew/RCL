package rcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rcl.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	List<Contact> findByFirstName(String name);
	List<Contact> findByLastName(String name);
	List<Contact> findByAddressOne(String address);
	
	
}