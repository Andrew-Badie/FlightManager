/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coe528;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class Manager {

    private ArrayList  <Flight> flights = new ArrayList<Flight>();
    private ArrayList  <Ticket> tickets = new ArrayList<Ticket>();
   
    public void createFlights(){
      flights.add(new Flight(0, "Toronto", "Vancouver", "12:45", 50, 10, 1200));
        
      
      }
      
    
    public Flight getFlight(int flightNumber){
 for (Flight a :  flights){
     if(a.getFlightNumber()==flightNumber){
         System.out.println(a);
         return a;
     }
   
 }return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p){
   
        
        for(Flight a : flights){
         
            
            if(a.getFlightNumber()==flightNumber){
             if(a.getNumberOfSeatsLeft()>0){
            p.applyDiscount(a.getOriginalPrice());
            a.setNumberOfSeatsLeft(a.getNumberOfSeatsLeft()-1);
            Ticket c = new Ticket(p.applyDiscount(a.getOriginalPrice()),a,p);
            tickets.add(c);
          
             }
             else{
                 System.out.println("No more seats left");
                 
             
             }
             
            }}}
    public void displayAvailableFlights(String origin, String destination){
       for(Flight a : flights){
           if(a.getDestination().equalsIgnoreCase(destination)&&a.getOrigin().equalsIgnoreCase(origin)&&a.getNumberOfSeatsLeft()>0){
               System.out.println(a);
    }
          
    
}
       
    }
    public void recieveTickets(){
        for(Ticket a: tickets){
            System.out.println(a);
        }
    }
            public static void main(String[] args) {
         Manager a = new Manager();
       
       Passenger p = new Member(5,"Albert Hanna", 65);
       a.createFlights();
       a.getFlight(0);
          a.bookSeat(0, p);       
           a.recieveTickets();
              
                  
               
                
    }
        
    
    
}