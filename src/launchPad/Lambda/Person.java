package launchPad.Lambda;

import java.time.LocalDate;
import launchPad.Lambda.enums.Sex;
import launchPad.Lambda.utils.PersonUtils;

public class Person extends PersonUtils {

  private String name;
  private LocalDate birthday;
  private Sex gender;
  private String emailAddress = emailAddressGenerator();
  private boolean certified = true;
  private int accessLevel = accessLevelGenerator();
  private boolean retired = false;
  private String employer = employerGenerator();

  public Person(String name, Sex gender, LocalDate birthday) {
    this.name = name;
    this.gender = gender;
    this.birthday = birthday;
  }

  public int getAge() {
    LocalDate now = LocalDate.now();
    return now.getYear() - birthday.getYear();
  }

  public String printPerson() {
    return "IT WORKS";
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", birthday=" + birthday +
        ", gender=" + gender +
        ", emailAddress='" + emailAddress + '\'' +
        ", certified=" + certified +
        ", accessLevel=" + accessLevel +
        ", retired=" + retired +
        ", employer='" + employer + '\'' +
        '}';
  }
}
