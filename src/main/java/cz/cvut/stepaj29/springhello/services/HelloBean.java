/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.springhello.services;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author jan
 */
@Component
@Scope("request")
public class HelloBean {
    
    protected String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public String sayHello()
    {
        return "hello world!";
    }
    public void execute()
    {
        FacesMessage message = new FacesMessage("ok", "Name " + userName + " submitted");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
