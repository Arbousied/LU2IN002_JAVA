public class Cabine{
  private int volume;
  private String couleur;
  public Cabine(int v, String c){
    volume = v;
    couleur = c;
  }
  public String toString(){
    return ("Volume cabine m3 : "+volume+"  Couleur : "+couleur);
  }
  public void setCouleur(String c){
    this.couleur = c;
  }
  public Cabine clone(){
  	return (new Cabine(volume, couleur));
  }
}
