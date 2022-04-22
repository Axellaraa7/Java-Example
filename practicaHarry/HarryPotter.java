package practicaHarry;


public class HarryPotter {
  public static void main(String[] args) {
    Mago Harry = new Mago("Harry Potter","Howgarts","Gryffindor","mestiza",41,"Dementor", "Ciervo", new String[]{"lengua parsel", "resistencia mágica"});
    System.out.println(Harry.toString());

    Mago Albus = new Mago("Albus Dumbledore","Howgarts","Gryffindor","mestiza",116,"Hermana Ariana","Ave Fénix", new String[]{"habla Sirenio","especialista en alquimia","transformaciones","oclumancia"});
    System.out.println();
    System.out.println(Albus.toString());

    Mago Snape = new Mago("Severus Snape","Howgarts","Slytherin","mestiza",38,"Voldemort","Cierva",new String[]{"experto en pociones", "maestría mágica"});
    System.out.println();
    System.out.println(Snape.toString());

    Mago Victor = new Mago("Viktor Krum", "Durmstrang","casa Durmstrang 1","pura",38,"Voldemort","patronus Krum",new String[]{"vuelo", "transformación","destreza en artes oscuras"});
    System.out.println();
    System.out.println(Victor.toString());

    Mago Fleur = new Mago("Fleur Delacour","Beauxbatons","casa Beauxbatons","pura",38,"Voldemort","patronus Fleur", new String[]{"belleza de veela","magia no verbal", "duelo"});
    System.out.println();
    System.out.println(Fleur.toString());
  }

}
