package edu.bu.met.cs665.creator;

import edu.bu.met.cs665.product.Business;
import edu.bu.met.cs665.product.Customer;
import edu.bu.met.cs665.product.Frequent;
import edu.bu.met.cs665.product.New;
import edu.bu.met.cs665.product.Returning;
import edu.bu.met.cs665.product.Vip;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This class represents a ConcreteCreator in the factory method pattern.
 */
public class CustomerFactory implements Factory {
  @Override
  public Customer createCustomer(String type) {
    switch (type) {
      case "Business":
        return new Business();
      case "Returning":
        return new Returning();
      case "Frequent":
        return new Frequent();
      case "New":
        return new New();
      case "Vip":
        return new Vip();
      default:
        return null;
    }
  }
}
