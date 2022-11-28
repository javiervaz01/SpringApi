package clients.app.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import entities.Contact;

@SpringBootTest
class CrmApplicationTests {

	@Autowired
	private ContactRepository cs;

	@Test
	void contextLoads() {
	}

	@Test
	void checkCreationOfOpportunity(){
		Contact contacto = this.cs.findByContactId(1);
		assertEquals(contacto.getId(), 1);
	}

}
