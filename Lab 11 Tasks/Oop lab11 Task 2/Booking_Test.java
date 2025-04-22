/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booking_test;

/**
 *
 * @author Admin
 */
public class Booking_Test {

public static void main(String[] args) {
Booking train = new TrainBooking("Ali", "2025-05-10") {};
Booking flight = new FlightBooking("Zara", "2025-05-15");

train.confirmBooking();
flight.confirmBooking();
}
}
