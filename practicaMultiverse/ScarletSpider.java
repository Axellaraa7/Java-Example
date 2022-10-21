package practicaMultiverse;

import practicaMultiverse.Intefaces.ScarletSpiderAbilities;

public class ScarletSpider extends Spiderman implements ScarletSpiderAbilities {

  private ScarletSpider(String name, String realName, String firstAppear, String origin){
    super(name,realName,firstAppear,origin);
  }

  public static ScarletSpider makeScarlet(String name, String realName, String firstAppear, String origin){
    return new ScarletSpider(name,realName,firstAppear,origin);
  }

  @Override
  public String attack() { return this.run()+" "+this.recovery()+" "+this.fastHits(); }

  @Override
  public String recovery() { return "I'm recovering";  }

  @Override
  public String fastHits() { return "I'm giving u 100 hits in a minute";}

  @Override
  public String run() { return "I'm running away from you";  }
}
