package practicaLineUp;

public class Evento implements Runnable{
  private String name;
  private Artista[] artists;
  private String place;

  public Evento(String name, Artista[] artists, String place){
    this.name = name;
    this.artists = artists;
    this.place = place;
  }

  public String getName() {return name;}

  public Artista[] getArtists() {return artists;}

  public String getPlace() {return place;}

  public void run(){
    /*for(int i=0;i<artists.length;i++){*/
      Runnable artist = artists[(int) Math.round(Math.random() * this.artists.length)];
      Thread artistThread = new Thread(artist);
      artistThread.run();
   /* }*/
  }
}
