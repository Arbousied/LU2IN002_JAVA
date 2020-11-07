public class Instrument{
  protected double poids;
  protected double prix;
  public Instrument(double lb, double $){
    poids = lb;
    prix = $;
  }
  public String toString(){
    return ("Poids: "+poids+" Prix: "+prix);
  }
}

class Piano extends Instrument{
  String name = "piano";
  public Piano(){
    super(Math.random() * 200, Math.random() * 2000);
  }
  public String jouer(){
    return ("La "+name+" joue ");
  }
}
class Guitare extends Instrument{
  String name = "guitare";
  public Guitare(){
    super(Math.random() * 200, Math.random() * 2000);
  }
  public String jouer(){
    return ("La "+name+" joue ");
  }
}
class Trompette extends Instrument{
  String name = "trompette";
  public Trompette(){
    super(Math.random() * 200, Math.random() * 2000);
  }
  public String jouer(){
    return ("La "+name+" joue ");
  }
}
