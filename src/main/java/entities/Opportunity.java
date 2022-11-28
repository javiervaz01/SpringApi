package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "opportunities")
public class Opportunity extends BaseEntity{

    // The class extends BaseEntity, a class I created that has an Id

    @OneToMany
    @JoinColumn(name="contact_id")
    private Contact contact;


    //this boolean is for checking if the object is an opportunity or a client
    //It is better this way instead of craeting a whole new entity with its new table
    //because they have the same attributes, changing the bool from false to true makes it a client
    @Column(name = "is_client")
    private boolean isClient;

    private String name;


}
