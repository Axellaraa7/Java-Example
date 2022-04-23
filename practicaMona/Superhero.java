package practicaMona;

public class Superhero extends Mona{
  private String nameHero, organization,realName;
  private String[] abilities;


  public Superhero(int id, String name, String job, String nameHero, String organization, String realName, String[] abilities){
    super(id,name,job);
    this.nameHero = nameHero;
    this.organization = organization;
    this.realName = realName;
    this.abilities = abilities;
  }

  public String getNameHero() {
    return nameHero;
  }

  public String getOrganization() {
    return organization;
  }

  public String getRealName() {
    return realName;
  }

  public String[] getHabilities() {
    return abilities;
  }

  public boolean setNameHero(String nameHero) {
    if(nameHero.isEmpty()) return false;
    this.nameHero = nameHero;
    return true;
  }

  public boolean setOrganization(String organization) {
    if(organization.isEmpty()) return false;
    this.organization = organization;
    return true;
  }

  public boolean setRealName(String realName) {
    if(realName.isEmpty()) return false;
    this.realName = realName;
    return true;
  }

  public boolean setHabilities(String[] abilities) {
    if(abilities.length < 1) return false;
    this.abilities = abilities;
    return true;
  }

  private String habilityString(){
    String message = "";
    if(this.abilities.length > 0) {
      message += " and my abilities are: ";
      for(String hability : this.abilities){ message += hability+" ";}
    }
    return message;
  }

  @Override
  public void describeMona() {
    System.out.println(this.toString());
    System.out.println("Hi, i'm "+this.nameHero+" and my real name is: "+this.realName+" i belong to: "+this.organization+this.habilityString());
  }
}
