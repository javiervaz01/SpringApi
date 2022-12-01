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
        Contact contact1 = new Contact(1,"Francisco Javier Vázquez", "Phone Call", false, "The person called by telephone at 9am", (LocalDate.of( 2022 , Month.JANUARY , 12 )));
        Contact contact2 = new Contact(2,"Luis Galocha","Email",true, "He stablished an email conversation with the agent", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        Contact contact3 = new Contact(3,"Alberto Vázquez", "Conversation",false, "He talked some minutes with the agent", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        Contact contact4 = new Contact(4,"Araceli Benítez","Video Conference",true, "A video conference stablished with the contact", (LocalDate.of( 2023 , Month.DECEMBER , 1 )));
        Contact contact5 = new Contact(5,"Araceli Benítez","Video Conference",false, "A video conference stablished with the contact", (LocalDate.of( 2023 , Month.DECEMBER , 1 )));
        Contact contact6 = new Contact(6,"Araceli Benítez","Video Conference",false, "A video conference stablished with the contact", (LocalDate.of( 2023 , Month.DECEMBER , 1 )));
        Contact contact7 = new Contact(7,"Araceli Benítez","Video Conference",false, "A video conference stablished with the contact", (LocalDate.of( 2023 , Month.DECEMBER , 1 )));
        Contact contact8 = new Contact(8,"Luis Galocha","Email",false, "He stablished an email conversation with the agent", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        Contact contact9 = new Contact(9,"Luis Galocha","Email",false, "He stablished an email conversation with the agent", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));
        Contact contact10 = new Contact(10,"Luis Galocha","Email",false, "He stablished an email conversation with the agent", (LocalDate.of( 2020 , Month.DECEMBER , 1 )));



        lista.add(contact1);
        lista.add(contact2);
        lista.add(contact3);
        lista.add(contact4);
        lista.add(contact5);
        lista.add(contact6);
        lista.add(contact7);
        lista.add(contact8);
        lista.add(contact9);
        lista.add(contact10);
        return lista;
    }
    List<Contact> lista = createContactList();
    


    @Transactional
    public List<Contact> getAllContacts(){
        lista.clear();
        lista =createContactList();
        List<Contact> lista2 = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
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
        List<Contact> lista2 = new ArrayList<>();

        for (int i = 0; i < lista.size()-1; i++) {
            boolean a = lista.get(i).isFutureAction();
            if(a){
                lista2.add(lista.get(i));
            }
        }
        return lista2;
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

    @Transactional
    public void changeContactToFutureActionAndViceversa(Integer Id,List<Contact> list){
        for(Contact c: list){
            if(c.getId().equals(Id) && c.isFutureAction() == false){
                c.setFutureAction(true);
                break;
            }else if(c.getId().equals(Id) && c.isFutureAction() == true){
                c.setFutureAction(false);
                break;

            }

        }
    }

    
    
    
}
