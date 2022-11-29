package clients.app.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import entities.Contact;
import entities.Opportunity;

@SpringBootTest
class CrmApplicationTests {


	@Autowired
	ContactService cs;

	@Autowired
	OpportunityService os;
	
	@Test
	void contextLoads() {
	}

	@Test
	void checkReturnsContacts(){
		List<Contact> lista = new ArrayList<>();
		lista = cs.getAllContacts();
		assertEquals(lista.get(0).getId(),1);
	}

	@Test
	void checkReturnsFutureActions(){
		List<Contact> lista = new ArrayList<>();
		lista = cs.getAllFutureActions();
		assertEquals(lista.get(0).getId(),2);
	}

	@Test
	void checkReturnsOpportunities(){
		List<Opportunity> lista = new ArrayList<>();
		lista = os.getAllOpportunities();
		assertEquals(lista.get(0).getId(),1);
	}

	@Test
	void checkGetContactById(){
		Contact contact1 = new Contact(1,false, "Phone call", (LocalDate.of( 2022 , Month.JANUARY , 12 )));
		Contact contact = cs.getContactById(1);
		assertEquals(contact.getId(),contact1.getId());
		assertEquals(contact.getAction(),contact1.getAction());
		assertEquals(contact.getDate(),contact1.getDate());
	}

	@Test
	void checkOpportunityById(){
        Opportunity opportunity1 = new Opportunity(1, 1, false, "Pasteleria de Pepe");
		Opportunity opportunity = os.getOpportunityById(1);
		assertEquals(opportunity.getId(),opportunity1.getId());
		assertEquals(opportunity.getContactId(),opportunity1.getContactId());
		assertEquals(opportunity.isClient(),opportunity1.isClient());
		assertEquals(opportunity.getName(),opportunity1.getName());

	}

	


}
