package edu.bu.met.cs665.product;

import edu.bu.met.cs665.Email;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This class represents a ConcreteProduct in the factory design pattern.
 */
public class Vip implements Customer {
  private Email email = new Email();

  @Override
  public String generateEmail() {
    email.setSubjectLine("Special Reward!");
    email.setBody("Here is your special reward for being our Vip.");
    return email.toString();
  }
}
