/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.coe528;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author andre
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
 /**
     * Test of constructor method, of class Flight.
     */
    @Test
    public void testConstructor() {
        System.out.println("Constructor");
        Flight expResult = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
       Flight Result = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        assertEquals(expResult,Result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
/**
     * Test of constructor method, of class Flight.
     */
    @Test
    public void testInvalidConstructor() {
        System.out.println("InvalidConstructor");
        Flight expResult = new Flight(5,"Italy", "Winnipeg","12:30",115,90,150);
       Flight Result = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        assertEquals(expResult,Result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1;
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setFlightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        String expResult = "Winnipeg";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Winnipeg";
       Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        String expResult = "Winnipeg";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Winnipeg";
       Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        String expResult = "12:00";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "12:00";
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        int expResult = 115;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 115;
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
       Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        int expResult = 12;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 12;
    Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150.0);
        double expResult = 150.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 150.0;
Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        instance.setOriginalPrice(originalPrice);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
     Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        boolean expResult = false;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       Flight instance = new Flight(1,"Toronto", "Winnipeg","12:30",115,90,150);
        String expResult = "Hello, my name is joe";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

   
 
}