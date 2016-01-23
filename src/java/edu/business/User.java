/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.business;

import java.io.Serializable;

/**
 *
 * @author Elena
 */
public class User implements Serializable {
   private String fullName;
   private String emailAddress;
   private String companyName;
   private String date;



    public User() {
        fullName = "";
        emailAddress = "";
        companyName = "";
        date = "";
        
    }

    public User(String fullName, String emailAddress, String companyName, String date) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.companyName = companyName;
        this.date = date;
       
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public String getCompanyName(){
        return companyName;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public String getDate(){
        return date;
    }
    

}