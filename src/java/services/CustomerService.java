package services;

import entities.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @PersistenceContext
    private EntityManager em;  

    public List<Customer> getAll() {
        return em
                .createNamedQuery("Customer.findAll", Customer.class)
                .getResultList();
    }
    
    @Transactional
    public void insert(Customer c){
        em.persist(c);
//        em.flush(); // FUCK NO
    }
}
