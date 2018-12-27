package launchPad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import launchPad.Anonymous.AnonymousOutfit;
import launchPad.Lambda.CheckPerson;
import launchPad.Lambda.Person;
import launchPad.Lambda.Person.Sex;
import launchPad.Lambda.SearchPersons;

public class Main {

  public static SearchPersons searchPersons = new SearchPersons();

  public static void main(String[] args) {
//    AnonymousOutfit suit = new AnonymousOutfit();
//    suit.sayHello();


    //Lambda expressions let you express instances of single-method classes more compactly.
    LocalDate date = LocalDate.now();
    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Joe", Sex.MALE, "joe@mail.ru", date));
    SearchPersons.printPersons(personList, new CheckPerson() {
      @Override
      public boolean test(Person p) {
        return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
        //return p.gender == Person.Sex.MALE && p.getAge() < 18;
      }
    });

    System.out.println();
  }



}//End of class
