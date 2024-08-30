/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.coe528;

/**
 *
 * @author andre
 */
public class Ticket {
protected double price;
protected Flight flight;
protected Passenger passenger;
protected static int number;

    public Ticket(double price, Flight flight, Passenger passenger) {
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
        number ++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Ticket.number = number;
    }

    @Override
    public String toString() {
        return (passenger.getName() + ", " + flight.toString()+", ticket price: $"+price);
    }

 
   
    

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}