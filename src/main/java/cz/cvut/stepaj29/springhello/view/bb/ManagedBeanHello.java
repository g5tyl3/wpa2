/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.springhello.view.bb;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author jan
 */
@ManagedBean
public class ManagedBeanHello {
    public String sayHello()
    {
        return "hello from managed";
    }
}
