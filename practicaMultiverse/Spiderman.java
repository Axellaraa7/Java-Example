package practicaMultiverse;

public abstract class Spiderman {
  private int id;
  private String name, realName,firstAppear,origin;

  public Spiderman(String name, String realName, String firstAppear, String origin){
    this.name = name;
    this.realName = realName;
    this.firstAppear = firstAppear;
    this.origin = origin;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getRealName() {
    return realName;
  }

  public String getFirstAppear() {
    return firstAppear;
  }

  public String getOrigin() {
    return origin;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean setName(String name) {
    if(name.isEmpty()) return false;
    this.name = name;
    return true;
  }

  public boolean setRealName(String realName) {
    if(realName.isEmpty()) return false;
    this.realName = realName;
    return true;
  }

  public boolean setFirstAppear(String firstAppear) {
    if(firstAppear.isEmpty()) return false;
    this.firstAppear = firstAppear;
    return true;
  }

  public boolean setOrigin(String origin) {
    if(origin.isEmpty()) return false;
    this.origin = origin;
    return true;
  }

  public String toString(){
    return "Hi I'm "+this.name+" but my real name is "+this.realName+" i came from "+this.origin+" and my first apparence was in "+this.firstAppear;
  }

  public abstract String attack();
}
