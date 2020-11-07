public class TestOrchestre{
  public static void main(){
    Orchestre o = new Orchestre();
    Guitare g = new Guitare();
    Piano p = new Piano();
    Trompette t = new Trompette();
    o.ajouterInstrument(g);
    o.ajouterInstrument(p);
    o.ajouterInstrument(t);
    o.jouer()
  }
}
