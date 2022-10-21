package practicaLineUp;

import java.util.Scanner;

public class LineUp{

  public static void main(String[] args) {
    Artista[] artists = new Artista[]{
      new Artista("Romeo Santos", "Bachata", "Male", 35, new String[]{"Ella y yo", "Todavía me amas", "Enseñame a olvidar", "Héroe favorito", "Centavito"}),
      new Artista ("Anuel AA", "Reggaeton", "Male", 35, new String[]{"Hasta que dios diga", "Amanece", "Adicto","Sola", "Ella quiere beber"})
    };

    for(int i=0;i<artists.length;i++){
      Runnable evento = new Evento("concierto1",artists,"Mexico");
      Thread eventoThread = new Thread(evento);
      eventoThread.start();
    }



    /*Runnable romeoRunnable = );
    Thread romeoThread = new Thread(romeoRunnable);
    romeoThread.start();

    Runnable anuelRunnable = new Artista ("Anuel AA", "Reggaeton", "Male", 35, new String[]{"Hasta que dios diga", "Amanece", "Adicto","Sola", "Ella quiere beber"});
    Thread anuelThread = new Thread(anuelRunnable);
    anuelThread.start();*/






  }

}
