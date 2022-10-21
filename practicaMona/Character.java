package practicaMona;

public class Character extends Mona{
  private String videogame;
  private String[] weapons;

  public Character(int id, String name, String job, String videogame, String[] weapons){
    super(id,name,job);
    this.videogame = videogame;
    this.weapons = weapons;
  }

  public String getVideogame(){return this.videogame;}
  public String[] getWeapons(){return this.weapons;}

  public boolean setVideogame(String videogame){
    if(videogame.isEmpty()) return false;
    this.videogame = videogame;
    return true;
  }

  public boolean setWeapons(String[] weapons){
    if(weapons.length == 0) return false;
    this.weapons = weapons;
    return true;
  }

  @Override
  public void describeMona() {
    System.out.println(this.toString());
    String describeWeapons = "";
    if(this.weapons.length > 0){
      describeWeapons = " and i use a ";
      for(String weapon : this.weapons){
        describeWeapons += weapon + " ";
      }
      describeWeapons += "in order to fight with the villains";
    }
    System.out.println("I'm from "+this.videogame+describeWeapons);
  }
}
