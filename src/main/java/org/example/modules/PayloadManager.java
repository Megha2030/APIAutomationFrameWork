package org.example.modules;

import com.google.gson.Gson;
import org.example.pojos.Booking;
import org.example.pojos.BookingDates;
import org.example.pojos.BookingResponse;

public class PayloadManager {

    //convert java objects to Json
    // using Gson -> serialization and deserialization

    Gson gson;

    public String createBookingPayloadAsString()
    {
        Booking booking = new Booking();
        booking.setFirstname("Megha");
        booking.setLastname("D");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        BookingDates bookingDates =new BookingDates();
        bookingDates.setCheckin("2018-01-01");
        bookingDates.setCheckout("2019-01-01");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);

        return jsonStringBooking;
    }

    //converting string to JAVA object
    public BookingResponse bookingResponseJava(String responseString)
    {
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString,BookingResponse.class);
        return bookingResponse;
    }
}
