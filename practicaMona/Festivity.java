package practicaMona;

public class Festivity extends Mona {
  private String festivity;
  private String[] colors;
  private String month;

  public Festivity(int id, String name, String job, String festivity, String[] colors, String month){
    super(id,name,job);
    this.festivity = festivity;
    this.colors = colors;
    this.month = month;
  }

  public String getFestivity() {return festivity;}

  public String[] getColors() {return colors;}

  public String getMonth() {return month;}

  public boolean setFestivity(String festivity) {
    if(festivity.isEmpty()) return false;
    this.festivity = festivity;
    return true;
  }

  public boolean setColors(String[] colors) {
    if(colors.length < 1) return false;
    this.colors = colors;
    return true;
  }

  public boolean setMonth(String month) {
    if(month.isEmpty()) return false;
    this.month = month;
    return true;
  }

  private String colorString(){
    String message = "";
    if(this.colors.length > 0) {
      message += " our most representative colors are: ";
      for(String color : this.colors){ message += color+" ";}
    }
    return message;
  }

  @Override
  public void describeMona() {
    System.out.println(this.toString());
    System.out.println("Hi, it's +"+this.month+" and we are going to celebrate a very important event that is: "+this.festivity+this.colorString());
  }
}
