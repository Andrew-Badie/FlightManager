/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coe528;

/**
 *
 * @author andre
 */
public class Member extends Passenger {
    protected int yearsOfMembership;

    public Member(int yearsOfMembership, String name, int age) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }
    
    public double applyDiscount (double p){
        if (yearsOfMembership>5){
         p=(p-(p*0.5));
            return   (p);
        }
        else if(yearsOfMembership>1 && yearsOfMembership<=5){
           p=(p-(p*0.1));
            return(p);
        }
        else{
         return p;   
        }
    }
}