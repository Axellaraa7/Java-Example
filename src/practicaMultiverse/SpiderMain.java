package practicaMultiverse;

public class SpiderMain {
  public static void main(String[] args) {
    PeterParker pp = PeterParker.makePeter("Spider-man","Petter Parket","Amazing Fantasy 15","Tierra 616");
    System.out.println();
    System.out.println(pp.toString());
    System.out.println(pp.attack());
    System.out.println();

    SpiderGwen sg = SpiderGwen.makeGwen("Spider-Gwen","Gwen Stacy","Edge of Spiderverse 2","Unknown");
    System.out.println();
    System.out.println(sg.toString());
    System.out.println(sg.attack());
    System.out.println();

    ScarletSpider sp = ScarletSpider.makeScarlet("Scarlet Spider","Kaine Parker","Web of Spiderman 119","Tierra 616");
    System.out.println();
    System.out.println(sp.toString());
    System.out.println(sp.attack());
  }
}
