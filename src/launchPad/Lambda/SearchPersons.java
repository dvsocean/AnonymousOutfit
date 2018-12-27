package launchPad.Lambda;

import java.util.List;

public class SearchPersons {

  public static void printPersonsOlderThan(List<Person> roster, int age) {
    for (Person p : roster) {
      if (p.getAge() >= age) {
        p.printPerson();
      }
    }
  }

  public static void printPersonsWithinAgeRange(
      List<Person> roster, int low, int high) {
    for (Person p : roster) {
      if (low <= p.getAge() && p.getAge() < high) {
        p.printPerson();
      }
    }
  }

  public static void printPersons (
      List<Person> roster, CheckPerson tester) {
    for (Person p : roster) {
      if (tester.test(p)) {
        p.printPerson();
      }
    }
  }

  class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
      return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
    }
  }





}//End of class
