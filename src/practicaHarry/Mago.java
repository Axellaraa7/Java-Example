package practicaHarry;

public class Mago {
  private String nombre, escuela, casa, sangre, boggart, patronus;
  private int edad;
  private String[] habilidades;


  public Mago(){
  }

  public Mago(String nombre , String escuela, String casa, String sangre, int edad, String boggart, String patronus, String[] habilidades){
    this.nombre = nombre;
    this.escuela = escuela;
    this.casa = casa;
    this.edad = edad;
    this.sangre = sangre;
    this.boggart = boggart;
    this.patronus = patronus;
    this.habilidades = habilidades;
  }

  public String toString(){
    String habilidadesString = "";
    if(this.habilidades.length>0){
      habilidadesString += " sus habilidades son: ";
      for(String habilidad : this.habilidades){
        habilidadesString += habilidad+" ";
      }
    }
    return "Nombre: "+this.nombre+
              " estudia en: "+this.escuela+
              " pertenece a: "+this.casa+
              " su sangre es: "+this.sangre+
              " y tiene: "+this.edad+
              " años.\nSu mayor miedo es: "+this.boggart+
              " y su protección tiene forma de: "+ this.patronus + habilidadesString;
  }
  public boolean setNombre(String nombre) {
    if(nombre.isEmpty()) return false;
    this.nombre = nombre;
    return true;
  }

  public boolean setEscuela(String escuela) {
    if(escuela.isEmpty()) return false;
    this.escuela = escuela;
    return true;
  }

  public boolean setCasa(String casa) {
    if(casa.isEmpty()) return false;
    this.casa = casa;
    return true;
  }

  public boolean setEdad(int edad) {
    if(edad < 10 ) return false;
    this.edad = edad;
    return true;
  }

  public boolean setBoggart(String boggart) {
    if(boggart.isEmpty()) return false;
    this.boggart = boggart;
    return true;
  }

  public boolean setPatronus(String patronus) {
    if(patronus.isEmpty()) return false;
    this.patronus = patronus;
    return true;
  }

  public void setHabilidades(String[] habilidades) {
    this.habilidades = habilidades;
  }
}
