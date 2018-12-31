package launchPad.Lambda.newSearchCriteria;

import java.util.function.Predicate;
import launchPad.Lambda.Person;

public class NameFilter implements Predicate<Person> {


  @Override
  public boolean test(Person person) {
    return false;
  }
}
