package clients.app.crm;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Contact;


@Service
public class ContactService {


    // @Autowired
    // public ContactService(ContactRepository cr){
    //     this.cr=cr;
    // }
    

    public List<Contact> createContactList(){
        List<Contact> lista = new ArrayList<>();
        Contact contact1 = new Contact(1,false, "Phone call", (LocalDate.of( 2022 , Month.JANUARY , 12 )));
        Contact contact2 = new Contact(2,true, "Email conversation", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        Contact contact3 = new Contact(3,false, "Normal talk", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        Contact contact4 = new Contact(4,true, "Video Conference", (LocalDate.of( 2021 , Month.DECEMBER , 1 )));
        lista.add(contact1);
        lista.add(contact2);
        lista.add(contact3);
        lista.add(contact4);
        return lista;
    }
    List<Contact> lista = createContactList();
    


    @Transactional
    public List<Contact> getAllContacts(){
        lista.clear();
        lista =createContactList();
        List<Contact> lista2 = new ArrayList<>();

        for (int i = 0; i < lista.size()-1; i++) {
            boolean a = lista.get(i).isFutureAction();
            if(!a){
                lista2.add(lista.get(i));
            }
        }
        return lista2;
    }
    @Transactional
    public List<Contact> getAllFutureActions(){
        lista.clear();
        lista =createContactList();
        for (int i = 0; i < lista.size()-1; i++) {
            boolean a = lista.get(i).isFutureAction();
            if(!a){
                lista.remove(i);
            }
        }
        return lista;
    }



    @Transactional
    public Contact getContactById(Integer id){
        Contact contact=null;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                contact = lista.get(i);

            }
        }
        return contact;
    }
    
    
}
