/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforgitdemo;

import java.io.Serializable;

/**
 *
 * @author Moieen
 */
public class Book implements Serializable{
    private int b_id;
    private String B_name;
    private String B_aurthor;
    
    public Book(){
        
    }

    public Book(int b_id, String B_name, String B_aurthor) {
        this.b_id = b_id;
        this.B_name = B_name;
        this.B_aurthor = B_aurthor;
    }
    

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return B_name;
    }

    public void setB_name(String B_name) {
        this.B_name = B_name;
    }

    public String getB_aurthor() {
        return B_aurthor;
    }

    public void setB_aurthor(String B_aurthor) {
        this.B_aurthor = B_aurthor;
    }

    @Override
    public String toString() {
        return this.getB_id()+ "," + this.getB_name()+","+ this.getB_aurthor(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
