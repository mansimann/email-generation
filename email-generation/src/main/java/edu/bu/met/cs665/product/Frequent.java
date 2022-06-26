package edu.bu.met.cs665.product;

import edu.bu.met.cs665.Email;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This class represents a ConcreteProduct in the factory design pattern.
 */
public class Frequent implements Customer {
  private Email email = new Email();

  @Override
  public String generateEmail() {
    email.setSubjectLine("Reward!");
    email.setBody("Here is your reward for being our loyal customer.");
    return email.toString();
  }
}
