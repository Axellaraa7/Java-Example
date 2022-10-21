package practicaMona;

public class Team extends Mona{
  private int cantity;
  private String type;
  private String activity;

  public Team(int id, String name, String job, int cantity, String type, String activity){
    super(id,name,job);
    this.cantity = cantity;
    this.type = type;
    this.activity = activity;
  }

  public int getCantity(){return this.cantity;}

  public String getType(){return this.type;}

  public String getActivity(){return this.activity;}

  public boolean setCantity(int cantity){
    if(cantity == 0) return false;
    this.cantity = cantity;
    return true;
  }

  public boolean setType(String type){
    if(type.isEmpty()) return false;
    this.type = type;
    return true;
  }

  public boolean setActivity(String activity){
    if(activity.isEmpty()) return false;
    this.activity = activity;
    return true;
  }
  @Override
  public void describeMona() {
    System.out.println(this.toString());
    System.out.println("Hi, we are a/an "+this.type+" and we are a team of "+this.cantity+" and we "+this.activity);
  }

}
