package practicaMultiverse;

import practicaMultiverse.Intefaces.SpiderGwenAbilities;

public class SpiderGwen extends Spiderman implements SpiderGwenAbilities {

  private SpiderGwen(String name, String realName, String firstAppear, String origin){
    super(name,realName,firstAppear,origin);
  }

  public static SpiderGwen makeGwen(String name, String realName, String firstAppear, String origin){
    return new SpiderGwen(name,realName,firstAppear,origin);
  }

  @Override
  public String attack() { return this.analyze()+" "+this.transportate()+" "+this.shoot();}

  @Override
  public String transportate() { return "I'm transportating in order u can't see me";  }

  @Override
  public String shoot() { return "I'm shooting u with my web-shooters"; }

  @Override
  public String analyze() { return "I'm analyzing how i have to fight "; }
}
