/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author ASUS
 */
public class Toyota1 extends Car
        {
    private String model;
    public Toyota1 (int  cylinders,String model){
        super( cylinders,"Toyota1");
        this.model=model;
    }

    @Override
    public String brake() {
        return "Toyota1-"+this.model+"started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "Toyota1-"+this.model+"accelarating"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Toyota1-"+this.model+"stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
