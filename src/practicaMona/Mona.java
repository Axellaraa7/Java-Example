package practicaMona;

public abstract class Mona {
  private String name, job;
  private int id;

  public Mona(){};

  public Mona(int id,String name,String job){
    this.id = id;
    this.name = name;
    this.job = job;
  }

  public String getName(){
    return this.name;
  }

  public String getJob(){
    return this.job;
  }

  public int getId(){
    return this.id;
  }

  public boolean setName(String name){
    if(name.isEmpty()) return false;
    this.name = name;
    return true;
  }

  public boolean setId(int id){
    if(id == 0) return false;
    this.id = id;
    return true;
  }

  public boolean setJob(String job){
    if(job.isEmpty()) return false;
    this.job = job;
    return true;
  }

  public String toString(){
    return "Id: "+this.id+" Nombre: "+this.name+" Job: "+this.job;
  }

  public abstract void describeMona();

}
