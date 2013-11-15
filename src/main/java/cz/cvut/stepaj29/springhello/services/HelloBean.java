/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.springhello.services;

import cz.cvut.stepaj29.springhello.bo.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author jan
 */
@Component
public class HelloBean {
    
    @Autowired
    EntityManagerFactory managerFactory;
    
    protected EntityManager getManager()
    {
        return managerFactory.createEntityManager();
    }
    
    public String sayHello(String userName)
    {
        User user = new User();
        user.setName(userName);
        getManager().persist(user);
        return "hello " + userName + " !";
    }
    
    public List<String> getNames()
    {
        return getManager().createQuery("select e from User e").getResultList();
        
    }
    
}
