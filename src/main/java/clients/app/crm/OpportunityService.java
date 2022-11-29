package clients.app.crm;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import entities.Opportunity;
import jakarta.transaction.Transactional;

@Service
public class OpportunityService {

    public List<Opportunity> createOpportunityList(){
        List<Opportunity> lista = new ArrayList<>();
        Opportunity opportunity1 = new Opportunity(1, 1, false, "Pasteleria de Pepe");
        Opportunity opportunity2 = new Opportunity(2, 1, false, "Panadería José");
        Opportunity opportunity3 = new Opportunity(3, 3, true, "Eliocons FVC");
        Opportunity opportunity4 = new Opportunity(4, 2, true, "Peluquería Casti");


        lista.add(opportunity1);
        lista.add(opportunity2);
        lista.add(opportunity3);
        lista.add(opportunity4);

        return lista;
    }
    List<Opportunity> lista = createOpportunityList();

    @Transactional
    public List<Opportunity> getAllOpportunities(){
        lista.clear();
        lista = createOpportunityList();
        List<Opportunity> lista2 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            boolean a = lista.get(i).isClient();
            if(!a){
                lista2.add(lista.get(i));

            }
        }
        return lista2;
    }

    @Transactional
    public List<Opportunity> getAllClients(){
        lista.clear();
        lista = createOpportunityList();
        List<Opportunity> lista2 = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            boolean a = lista.get(i).isClient();
            if(a){
                lista2.add(lista.get(i));

            }
        }
        return lista2;
    }

    @Transactional
    public Opportunity getOpportunityById(Integer id){
        Opportunity opportunity=null;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                opportunity = lista.get(i);

            }
        }
        return opportunity;
    }
   
    
}
