package launchPad.Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import launchPad.Lambda.enums.Sex;

public class SearchPersons {

  protected static List<Person> personList = new ArrayList<>();

  protected static void populateArray(){
    personList.add(new Person("Joe", Sex.MALE, LocalDate.of(2001,11, 9)));
    personList.add(new Person("Vanessa", Sex.FEMALE, LocalDate.of(1994, 3, 28)));
    personList.add(new Person("Steve", Sex.MALE, LocalDate.of(1960, 1, 17)));
    personList.add(new Person("Aikey ", Sex.FEMALE, LocalDate.of(1954, 1, 24)));
    personList.add(new Person("Rodger", Sex.MALE, LocalDate.of(1900, 2, 4)));
  }

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

  protected static List<Person> printPersons (List<Person> roster, Predicate<Person> tester) {
    List<Person> listRange = new ArrayList<>();
    for (Person p : roster) {
      if(tester.test(p)){
        listRange.add(p);
      }
    }
    return listRange;
  }

//  public static class CheckPersonEligibleForSelectiveService implements Predicate<Person> {
//
//    @Override
//    public boolean test(Person person) {
//      return person.getAge() >= 16 && person.getAge() <= 75;
//    }
//
//  }

  protected static void processPerson(Consumer<Person> consumer){
    Person p = new Person("Joe", Sex.MALE, LocalDate.of(1999, 11, 1));
    consumer.accept(p);
  }

  protected static void processTwoLambdas(Predicate<Person> prd, Consumer<Person> cns){
    Person p = new Person("Joe", Sex.MALE, LocalDate.of(1999, 11, 1));
    if(prd.test(p)){
      cns.accept(p);
    }
  }

  protected static void performAction(Consumer<Person> cns){
    Person p = new Person("Joe", Sex.MALE, LocalDate.of(1999, 11, 1));
    cns.accept(p);
  }

  protected static void abstractMethodThatReturnsValueToSecondArg(Function<Person, Integer> mapper, Consumer<Integer> cns){
    Person p = new Person("Joe", Sex.MALE, LocalDate.of(1999, 11, 1));
    Integer data = mapper.apply(p);
    System.out.println("Mapper data --> " + data);
    cns.accept(data);
  }







}//End of class
