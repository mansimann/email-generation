package edu.bu.met.cs665.creator;

import edu.bu.met.cs665.product.Customer;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This interface represents a Creator in the factory method pattern.
 */
public interface Factory {
  /**
   * Creates customers.
   *
   * @param type a String specifying the type of customer
   * @return a concrete customer
   */
  Customer createCustomer(String type);
}
