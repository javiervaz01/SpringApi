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
	void checkReturnsOpportunities(){
		List<Opportunity> lista = new ArrayList<>();
		lista = os.getAllOpportunities();
		assertEquals(lista.get(0).getId(),1);
	}



}
