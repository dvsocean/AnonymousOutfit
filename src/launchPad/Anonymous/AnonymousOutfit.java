package launchPad.Anonymous;

public class AnonymousOutfit {

  public void sayHello() {

    class Outfit implements ConformToOutfit {
      private String who = "";

      public void gangsterTalk() {
        gangsterPickupLine("how you doin..?");
      }
      public void gangsterPickupLine(String senorita) {
        who = senorita;
        System.out.println("Tree word pickup line... " + who);
      }
    }//End class declaration and instantiate an object
    ConformToOutfit englishMob = new Outfit();


    ConformToOutfit frenchMob = new ConformToOutfit() {
      String who = "";
      public void gangsterTalk() {
        gangsterPickupLine("this string is over written..so it doesn't matter");
      }
      public void gangsterPickupLine(String senorita) {
        who = senorita;
        System.out.println("Ligne de collecte de mots d'arbre... " + who);
      }
    };// Anonymous function assigned to a variable


    ConformToOutfit spanishMob = new ConformToOutfit() {
      String who = "";
      public void gangsterTalk() {
        gangsterPickupLine("mamasita");
      }
      public void gangsterPickupLine(String senorita) {
        who = senorita;
        System.out.println(who + ", linea de recogida de palabras del arbol.");
      }
    };// Anonymous function assigned to a variable


    //main function output
    englishMob.gangsterTalk();
    frenchMob.gangsterPickupLine("im overwriting the previous string!!");
    spanishMob.gangsterTalk();

  }//End of function

}//End of class
