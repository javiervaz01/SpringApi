package clients.app.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Contact;

@Controller
@RequestMapping("/contacts")
public class ContactController {

    private ContactService cs;

    @Autowired
    public ContactController(ContactService cs){
        this.cs = cs;
    }

    @GetMapping()
    public List<Contact> getAllContacts(){
        return cs.getAllContacts();
    }
    
}
