public class Orchestre{
  private Instrument[] tab;
  public Orchestre(){}
  public void ajouterInstrument(Instrument i){
    int j;
    for(j = 0; tab[j] != null;j++){

    }
    tab[j - 1] = i;
  }
  public String jouer(){
    for(Instrument i : tab){
      (Instrument)i.jouer();
    }
  }
}
