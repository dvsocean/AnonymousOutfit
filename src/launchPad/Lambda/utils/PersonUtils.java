package launchPad.Lambda.utils;

public class PersonUtils {

  protected int accessLevelGenerator(){
    int[] accessArray = new int[]{
        1,2,3,4,5,6,7,8,9
    };
    int index = (int) (Math.random() * accessArray.length);
    return accessArray[index];
  }

  protected String employerGenerator(){
    String[] employeCollection = new String[]{
        "American Airlines", "Experian", "Blizzard", "Zenar",
        "Kia", "HackReactor", "NodeFinder", "Billabong"
    };
    int index = (int) (Math.random() * employeCollection.length);
    return employeCollection[index];
  }

  protected String emailAddressGenerator(){
    String[] employeCollection = new String[]{
        "AmericanPsycho@yahoo.com", "allTogetherNever@mail.ru", "BlizzChamp@aol.com", "NothingMore@gmail.com",
        "causeItsFriday@gmail.com", "kryptonite_75@hotmail.com", "petsa55@yahoo.com", "denis2012@gmail.com"
    };
    int index = (int) (Math.random() * employeCollection.length);
    return employeCollection[index];
  }

}//End of class
