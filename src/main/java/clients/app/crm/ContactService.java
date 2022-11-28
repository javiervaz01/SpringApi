package clients.app.crm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Contact;


@Service
public class ContactService {

    private ContactRepository cr;

    @Autowired
    public ContactService(ContactRepository cr){
        this.cr=cr;
    }


    @Transactional
    public List<Contact> getAllContacts(){
        List<Contact> lista = new ArrayList<>();
        lista = cr.findAll();
        return lista;
    }
    
    
}
