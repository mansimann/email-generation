package edu.bu.met.cs665.product;

import edu.bu.met.cs665.Email;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This class represents a ConcreteProduct in the factory design pattern.
 */
public class Returning implements Customer {
  private Email email = new Email();

  @Override
  public String generateEmail() {
    email.setSubjectLine("Welcome Back!");
    email.setBody("Thanks for being our customer again.");
    return email.toString();
  }
}
