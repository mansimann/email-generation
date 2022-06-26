package edu.bu.met.cs665;

import edu.bu.met.cs665.creator.CustomerFactory;
import edu.bu.met.cs665.creator.Factory;
import edu.bu.met.cs665.product.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 3
 * Description: This is a JUnit Test.
 *
 * Scenario: Factory creates the five different types of customers. Then, each customer generates custom email text.
 */
public class GenerateEmailTest {

    @Test
    public void testGenerateEmail() {

        Factory factory = new CustomerFactory();

        Customer c1 = factory.createCustomer("Business");
        Customer c2 = factory.createCustomer("Returning");
        Customer c3 = factory.createCustomer("Frequent");
        Customer c4 = factory.createCustomer("New");
        Customer c5 = factory.createCustomer("Vip");

        String actual = "Order Confirmation!" + "\n" + "Thanks for ordering with us.";
        assertEquals(c1.generateEmail(), actual);

        actual = "Welcome Back!" + "\n" + "Thanks for being our customer again.";
        assertEquals(c2.generateEmail(), actual);

        actual = "Reward!" + "\n" + "Here is your reward for being our loyal customer.";
        assertEquals(c3.generateEmail(), actual);

        actual = "Welcome!" + "\n" + "Thanks for becoming our customer.";
        assertEquals(c4.generateEmail(), actual);

        actual = "Special Reward!" + "\n" + "Here is your special reward for being our Vip.";
        assertEquals(c5.generateEmail(), actual);

    }
}
