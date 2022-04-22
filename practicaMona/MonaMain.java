package practicaMona;

public class MonaMain {
  public static void main(String[] args) {
    Trade puppet  = new Trade(4, "puppeteer"," puppeteer", "puppet","hat", "", "");
    puppet.describeMona();
    Team benevo  = new Team(6, "BenevoCats","Benevo",8,"Association","Fight for the environment");
    benevo.describeMona();
    Character megamaan = new Character(60, "MegaCat","Megamaan","Megamaan", new String[]{"helmet", "laser guns"});
    megamaan.describeMona();
    Festivity muerto  = new Festivity(56, "Octocat de los muertos","Costume", "Día de muertos", new String[]{"black","white","purple"},"november");
    muerto.describeMona();
    Celebrity ironcat = new Celebrity(17, "Monroe"," Celebrity","Marilyn Monroe", "Actrees", 1926);
    ironcat.describeMona();
    Superhero cons  = new Superhero(24, "IronCat"," Engineer", "Iron Man","Marvel", "Tony Stark", new String[]{"fly", "intelligence", ""});
    cons.describeMona();

  }

}
