package practicaMona;

public class Superhero extends Mona{
  private String nameHero, organization,realName;
  private String[] habilities;


  public Superhero(int id, String name, String job, String nameHero, String organization, String realName, String[] habilities){
    super(id,name,job);
    this.nameHero = nameHero;
    this.organization = organization;
    this.realName = realName;
    this.habilities = habilities;
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
    return habilities;
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

  public boolean setHabilities(String[] habilities) {
    if(habilities.length < 1) return false;
    this.habilities = habilities;
    return true;
  }

  private String habilityString(){
    String message = "";
    if(this.habilities.length > 0) {
      message += " and my habilities are: ";
      for(String hability : this.habilities){ message += hability+" ";}
    }
    return message;
  }

  @Override
  public void describeMona() {
    System.out.println(this.toString());
    System.out.println("Hi, i'm "+this.nameHero+" and my real name is: "+this.realName+" i belong to: "+this.organization+this.habilityString());
  }
}
