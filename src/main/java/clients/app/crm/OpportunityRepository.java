package clients.app.crm;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import entities.Contact;
import entities.Opportunity;

public interface OpportunityRepository extends CrudRepository<Opportunity,Integer>{
    
    @Query("SELECT opportunity FROM opportunities opportunity WHERE opportunity.contact =:contactId")
    public List<Contact> findOpportunityByContactId(@Param("contactId") int contactId);

    List<Contact> findByOpportunityId(Integer opportunityId);
}
