package practicaMona;

public class Celebrity extends Mona{
  private String nameCelebrity, role;
  private int yearBirth;

  public Celebrity(int id, String name, String job, String nameCelebrity, String role, int yearBirth){
    super(id,name,job);
    this.nameCelebrity = nameCelebrity;
    this.role = role;
    this.yearBirth = yearBirth;
  }

  @Override
  public void describeMona() {
    System.out.println(this.toString());
    System.out.println("Hi, i'm " + this.nameCelebrity + " and i'm a: " + this.role + " and i was born in " + this.yearBirth);
  }
}