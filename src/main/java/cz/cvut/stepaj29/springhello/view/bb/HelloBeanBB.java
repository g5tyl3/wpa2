/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.springhello.view.bb;

import cz.cvut.stepaj29.springhello.services.HelloBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author jan
 */
@Component
@Scope("request")
public class HelloBeanBB {
    
    protected String userName;
    @Autowired(required = true) //tohle zaridi naplneni tydle promenny spravnym objektem
    protected HelloBean helloBean;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public void execute()
    {
        String greetingMessage = helloBean.sayHello(userName);
        FacesMessage message = new FacesMessage("ok", greetingMessage);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
