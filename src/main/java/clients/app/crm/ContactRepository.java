package clients.app.crm;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import entities.Contact;

public interface ContactRepository extends CrudRepository<Contact,Integer>{
    
    @Query("SELECT contact FROM Contacts contact left join fetch opportunity.contact WHERE opportunity.contact =:opportunityId")
    public List<Contact> findContactByOpportunityId(@Param("opportunityId") int opportunityId);

    Contact findByContactId(Integer contactId);

    List<Contact> findAll();
}
