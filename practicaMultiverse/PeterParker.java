package practicaMultiverse;

import practicaMultiverse.Intefaces.PeterParkerAbilities;

public class PeterParker extends Spiderman implements PeterParkerAbilities {

  private PeterParker(String name, String realName, String firstAppear, String origin){
    super(name,realName,firstAppear,origin);
  }

  public static PeterParker makePeter(String name, String realName, String firstAppear, String origin){
    return new PeterParker(name,realName,firstAppear,origin);
  }

  @Override
  public String attack() { return this.dodge() + " " + this.crawl() + " " + this.powerHit();  }

  @Override
  public String powerHit() {
    return "I'm giving you a super shot";
  }

  @Override
  public String crawl() { return "I'm crawling the wall"; }

  @Override
  public String dodge() { return "I'm dodging your hit"; }

}
