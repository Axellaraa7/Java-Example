package practicaLineUp;

import practicaLineUp.Interfaces.ArtistaActions;

public class Artista implements ArtistaActions,Runnable {
  private String name, genre, gender;
  private int age;
  private String[] songs;

  public Artista(String name, String genre, String gender, int age, String[] songs){
    this.name = name;
    this.genre = genre;
    this.gender = gender;
    this.age = age;
    this.songs = songs;
  }

  public String getName() {return name;}

  public String getGenre() {return genre;}

  public String getGender() {return gender;}

  public int getAge() {return age;}

  public String[] getSongs(){return songs;}

  public String introduce(){
    return "Hi! I'm " + this.name + " and todaaay we are togetheeeer \n";
  }

  @Override
  public String talkCrowd() {
    return this.name + " : Hi everyone! How are u todaaaay?\n";
  }

  @Override
  public String animate() {
    return this.name + " : Come on! Come on!\n";
  }

  @Override
  public String sing(String song) {
    return this.name + " : I'm gonna sing the next song "+song+"\n";
  }

  @Override
  public String interactCrowd() {
    return this.name + " : Let's go, sing with me!! ...\n";
  }

  @Override
  public void run() {
    System.out.println(this.introduce());
    System.out.println(this.talkCrowd());
    for(int i = 0; i<5 ; i++){
      System.out.println(this.sing(this.songs[i]));
      String action = (i%2 == 0) ? this.interactCrowd() : this.animate();
      System.out.println(action);
    }
  }
}
