/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booking_test;

/**
 *
 * @author Admin
 */
public class TrainBooking extends Booking {
public TrainBooking(String customerName, String date) {
super(customerName, date);
}

@Override
public void confirmBooking() {
System.out.println("Train ticket confirmed for " + customerName + " on " + date + ".");
    }
}
