/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_test;

/**
 *
 * @author Admin
 */
public abstract class Booking {
protected String customerName;
protected String date;

public Booking(String customerName, String date) {
this.customerName = customerName;
this.date = date;
}

public abstract void confirmBooking();   
}
