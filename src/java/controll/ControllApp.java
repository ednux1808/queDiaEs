/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modell.AplicationsMetodos;
import modell.data.Dates;

/**
 *
 * @author Eduardo
 */
@ManagedBean
@RequestScoped
public class ControllApp {
    @ManagedProperty(value = "#{aplicationsMetodos}")
            
    private AplicationsMetodos app = new AplicationsMetodos();
    
    
    public void antenderSolicitud(){
        this.app.Operation();
    }
  

    public AplicationsMetodos getApp() {
        return app;
    }

    public void setApp(AplicationsMetodos app) {
        this.app = app;
    }

    public ControllApp() {
    }
    
    
    
}
