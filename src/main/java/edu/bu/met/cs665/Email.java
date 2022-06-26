package edu.bu.met.cs665;

/**
 * Name: Mansi Mann.
 * Date: 03/10/2022
 * Course: CS-665
 * Assignment 4
 * Description: This class represents an Email.
 */
public class Email {

  private String subjectLine;
  private String body;

  /**
   * Class constructor.
   */
  public Email() {
    subjectLine = "Subject Line";
    body = "Body";
  }

  /**
   * Sets the email's subject line.
   * @param subjectLine subject line of the email
   */
  public void setSubjectLine(String subjectLine) {
    this.subjectLine = subjectLine;
  }

  /**
   * Sets the email's body.
   * @param body body of the email
   */
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Gets the email text.
   * @return the email text
   */
  public String toString() {
    return subjectLine + "\n" + body;
  }
}
