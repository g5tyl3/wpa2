/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.springhello.services;

import org.springframework.stereotype.Component;

/**
 *
 * @author jan
 */
@Component
public class HelloBean {
    public String sayHello()
    {
        return "hello world!";
    }
    
}
