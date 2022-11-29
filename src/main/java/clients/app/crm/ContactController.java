package clients.app.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Contact;

@RestController
@CrossOrigin
public class ContactController {

    private ContactService cs;

    @Autowired
    public ContactController(ContactService cs){
        this.cs = cs;
    }

    @RequestMapping("/contacts")
    public List<Contact> getAllContacts(){
        return cs.getAllContacts();
    }

    @RequestMapping("/futureactions")
    public List<Contact> getAllFutureActions(){
        return cs.getAllFutureActions();
    }
    
}
