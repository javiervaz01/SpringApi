package entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Opportunity{

    // The class extends BaseEntity, a class I created that has an Id

    @Id
	Integer id;
    
    private int contactId;


    //this boolean is for checking if the object is an opportunity or a client
    //It is better this way instead of craeting a whole new entity with its new table
    //because they have the same attributes, changing the bool from false to true makes it a client
    
    private boolean isClient;

    private String name;

    public Integer getId() {
        return id;
    }

    public int getContactId() {
        return contactId;
    }

    public boolean isClient() {
        return isClient;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public void setClient(boolean isClient) {
        this.isClient = isClient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Opportunity(Integer id, int contactId, boolean isClient, String name) {
        this.id = id;
        this.contactId = contactId;
        this.isClient = isClient;
        this.name = name;
    }

    


}
