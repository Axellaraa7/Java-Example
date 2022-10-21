package practicaMona;

public class Trade extends Mona{
  private String tool;
  private String headDecoration;
  private String bodyDecoration;
  private String legDecoration;

  public Trade(int id, String name, String job, String tool, String headDecoration,String bodyDecoration, String legDecoration){
    super(id,name,job);
    this.tool = tool;
    this.headDecoration = headDecoration;
    this.bodyDecoration = bodyDecoration;
    this.legDecoration = legDecoration;
  }

  public String getTool() {return tool;}

  public String getHeadDecoration() {return headDecoration;}

  public String getBodyDecoration() {return bodyDecoration;}

  public String getLegDecoration() {return legDecoration;}

  public boolean setTool(String tool) {
    if(tool.isEmpty()) return false;
    this.tool = tool;
    return true;
  }

  public boolean setHeadDecoration(String headDecoration) {
    if(headDecoration.isEmpty()) return false;
    this.headDecoration = headDecoration;
    return true;
  }

  public boolean setBodyDecoration(String bodyDecoration) {
    if(bodyDecoration.isEmpty()) return false;
    this.bodyDecoration = headDecoration;
    return true;
  }

  public boolean setLegDecoration(String legDecoration) {
    if(legDecoration.isEmpty()) return false;
    this.legDecoration = headDecoration;
    return true;
  }

  @Override
  public void describeMona() {
    System.out.println(this.toString());
    String outfit = "";

    if(!this.headDecoration.isEmpty()) outfit += " and i use in my head a: "+this.headDecoration;
    if(!this.bodyDecoration.isEmpty()) outfit += " and i use in my body a: "+this.bodyDecoration;
    if(!this.legDecoration.isEmpty()) outfit += "and i use in my legs a: "+this.legDecoration;

    String message = "Hi i'm a Mona and i use a "+this.tool+" in my work "+outfit;
    System.out.println(message);
  }
}
