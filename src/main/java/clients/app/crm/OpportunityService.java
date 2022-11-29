package clients.app.crm;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import entities.Opportunity;
import jakarta.transaction.Transactional;

@Service
public class OpportunityService {

    @Transactional
    public List<Opportunity> getAllOpportunities(){
        List<Opportunity> lista = new ArrayList<>();
        Opportunity opportunity1 = new Opportunity(1, 1, false, "Opportunity of selling our application of car service");
        Opportunity opportunity2 = new Opportunity(2, 1, true, "Application sold to IMB");
        lista.add(opportunity1);
        lista.add(opportunity2);
        return lista;
    }
    
}
