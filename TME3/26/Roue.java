public class Roue{
  private int diamètre;
  public Roue(int d){
    diamètre = d;
  }
  public Roue(){
    this(60);
  }
  public String toString(){
    return ("Roue de diamètre: "+diamètre);
  }
  public Roue clone(){
  	return (new Roue(diamètre));
  }
}
