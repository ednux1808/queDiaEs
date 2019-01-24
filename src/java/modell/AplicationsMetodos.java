/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import javax.faces.bean.ManagedBean;
import modell.data.Dates;

/**
 *
 * @author Eduardo Zamora
 */
@ManagedBean
public class AplicationsMetodos {

    
    private Dates date = new Dates();

    public AplicationsMetodos() {
        this.date = new Dates();
    }

    public void test() {
        this.date.setDia(24);
        this.date.setAño(2019);
        this.date.setMes(1);
    }

    public void Operation() {
        //Operation A
        double aR = (14 - this.date.getMes());
        this.date.setA(aR / 12);

        //Operation B
        int bR = (int) this.date.getA();
        this.date.setB(this.date.getAño()- bR);

        //Operation C
        this.date.setC((this.date.getMes()+12*(int)this.date.getA())-2);
        
        //Operation D
        this.date.setD((this.date.getB()/4));
        
        //Operation E
        this.date.setE(this.date.getB()/100);
        
        //Operation F
        this.date.setF((this.date.getB())/400);
        
        //Operation G
        this.date.setG((31*this.date.getC())/12);
        
        //Operation H
        this.date.setH(this.date.getDia()+this.date.getB()+(int)this.date.getD()-(int)this.date.getE()+(int)this.date.getF()+(int)this.date.getG());   
        
        //Operation I
        this.date.setI(this.date.getH()%7);
               
        //Que dia es?
        switch(this.date.getI()){
            case 0:this.date.setDiaSemana("Domingo");break;
            case 1:this.date.setDiaSemana("Lunes");break;
            case 2:this.date.setDiaSemana("Martes");break;
            case 3:this.date.setDiaSemana("Miercoles");break;
            case 4:this.date.setDiaSemana("Jueves");break;
            case 5:this.date.setDiaSemana("Viernes");break;
            case 6:this.date.setDiaSemana("Sabado");break;
        }
        
        //System.out.println("el dia de la Semana es :"+this.date.getDiaSemana());
        
    }
    
    public void clear(){
        this.date.setAño(0);
        this.date.setMes(0);
        this.date.setDia(0);
        this.date.setDiaSemana("");
    }

    public Dates getDate() {
        return date;
    }

    public void setDate(Dates date) {
        this.date = date;
    }

    

}
