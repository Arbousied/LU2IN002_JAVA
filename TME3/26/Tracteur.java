public class Tracteur{
  private Cabine c;
  private Roue r1, r2, r3, r4;
  public Tracteur(Cabine c1, Roue R1, Roue R2, Roue R3, Roue R4){
    c = c1;
    r1 = R1;
    r2 = R2;
    r3 = R3;
    r4 = R4;
  }
  public String toString(){
    return ("Cabine :"+c.toString()+" Roue 1 : "+r1.toString()+" Roue 2 : "+r2.toString()+" Roue 3 : "+r3.toString()+" Roue 4 : "+r4.toString());
  }
  public void peindre(String couleur){
    c.setCouleur(couleur);
  }
  public Tracteur clone(){
    return new Tracteur(c.clone(), r1.clone(), r2.clone(), r3.clone(), r4.clone());
  }
}
