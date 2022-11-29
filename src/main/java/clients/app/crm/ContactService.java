package clients.app.crm;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ContactService {


    // @Autowired
    // public ContactService(ContactRepository cr){
    //     this.cr=cr;
    // }
    List<Contact> lista = new ArrayList<>();
    
    


    @Transactional
    public List<Contact> getAllContacts(){
        List<Contact> lista = new ArrayList<>();
        Contact contact1 = new Contact(1,false, "Phone call", (LocalDate.of( 2022 , Month.JANUARY , 12 )));
        Contact contact2 = new Contact(2,false, "Email conversation", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        lista.add(contact1);
        lista.add(contact2);
        return lista;
    }
    
    
}
