package launchPad;

import java.util.List;
import launchPad.Anonymous.AnonymousOutfit;
import launchPad.Lambda.Person;
import launchPad.Lambda.SearchPersons;


public class Main extends SearchPersons {

  public static void main(String[] args) {
    /*Uncomment these lines for an example of the old way of using anonymous
    * classes. Lambda expressions achieve the same thing but with a much cleaner
    * syntax.*/

//    AnonymousOutfit suit = new AnonymousOutfit();
//    suit.sayHello();

    /*Lambda expressions let you express instances of single-method classes
    * more compactly by passing in functionality as an argument. Uncomment to see
    * lambda expressions in action*/
    populateArray();

    List<Person> res = printPersons(personList, person -> person.getAge() >= 16 && person.getAge() < 100);

    for(Person p: res) {
      System.out.println(p.toString());
    }

    System.out.println("\n");

    //Lambda way of calling the printPerson method
    processPerson(Person::printPerson);
    System.out.println("\n");

    //The Predicate interface and the Consumer interface
    processTwoLambdas(person -> person.getAge() > 10, Person::printAge);

    //The Function interface, gets a value (arg1) then passes it to (arg2) for output
    abstractMethodThatReturnsValueToSecondArg(Person::getAge, System.out::println);

    //Perform a diff action using lambda expressions
    performAction(Person::getEmail);
  }





}//End of class
