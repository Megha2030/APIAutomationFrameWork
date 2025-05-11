package org.example.tests.sample;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    //this class contains dummy test cases
    //for health check of dependencies

    @Test(groups = "qa", priority = 1)
    @Description("TC#INT1 - Step1 verify booking can be created")
    public void testCreateBooking()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Description("TC#INT2 - Step2 verify booking by id")
    public void testVerifyBookingId()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Description("TC#INT3 - Step3 verify updated booking by id")
    public void testUpdateBookingById()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Description("TC#INT4 - Step4 delete booking by id")
    public void testDeleteBookingById()
    {
        Assert.assertTrue(true);
    }
}
