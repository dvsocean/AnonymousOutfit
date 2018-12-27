package launchPad.Lambda;

import java.time.LocalDate;

public class Person {

  public enum Sex {
    MALE, FEMALE
  }

  public String name;
  public LocalDate birthday;
  public Sex gender;
  public String emailAddress;

  public Person(String name, Sex gender, String emailAddress, LocalDate birthday) {
    this.name = name;
    this.gender = gender;
    this.emailAddress = emailAddress;
    this.birthday = birthday;
  }

  public int getAge() {
    // ...
    return 33;
  }

  public String printPerson() {
    return "IT WORKS";
  }

}
