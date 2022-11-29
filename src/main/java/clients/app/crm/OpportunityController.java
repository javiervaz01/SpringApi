package clients.app.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Opportunity;

@RestController
@CrossOrigin
public class OpportunityController {

    private OpportunityService os;

    @Autowired
    public OpportunityController(OpportunityService os){
        this.os = os;
    }

    @RequestMapping("/opportunities")
    public List<Opportunity> getAllOpportunities(){
        return os.getAllOpportunities();
    }

    @RequestMapping("/clients")
    public List<Opportunity> getAllClients(){
        return os.getAllClients();
    }

    @RequestMapping("/opportunities/{id}")
    public Opportunity getOpportunitiesById(@PathVariable("id") Integer id){
        return os.getOpportunityById(id);
    }

    @RequestMapping("/clients/{id}")
    public Opportunity getContactsById(@PathVariable("id") Integer id){
        return os.getOpportunityById(id);
    }
    
}
