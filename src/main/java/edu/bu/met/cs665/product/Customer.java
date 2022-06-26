package edu.bu.met.cs665.product;

import edu.bu.met.cs665.Email;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This interface represents a Product in the factory design pattern.
 */
public interface Customer {
  /**
   * Generates a custom email.
   *
   * @return the custom Email text.
   */
  public abstract String generateEmail();
}
