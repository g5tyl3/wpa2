/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.springhello.services;

import cz.cvut.stepaj29.springhello.bo.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Component;

/**
 *
 * @author jan
 */
@Component
public class HelloBean {
    
    @PersistenceUnit
    protected EntityManager entityManager;
    
    public String sayHello(String userName)
    {
        User user = new User();
        user.setName(userName);
        entityManager.persist(user);
        return "hello " + userName + " !";
    }
    
    public List<String> getNames()
    {
        return entityManager.createQuery("select e from User e").getResultList();
        
    }
    
}
