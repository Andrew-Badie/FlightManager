/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coe528;

/**
 *
 * @author andre
 */
public class NonMember extends Passenger{

    public NonMember(String name, int age) {
        super(name, age);
    }
  public double applyDiscount(double p){
      if(age>65){
          p=(p-(p*0.1));
          return(p);
      }
      else{
          return p;
      }
  }
}
