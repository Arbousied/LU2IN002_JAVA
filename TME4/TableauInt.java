import java.lang.Math;
public class TableauInt{
  public static int TAILLE = 10;
  private int[] tab;
  public TableauInt(){
    tab = new int[TAILLE];
    for (int i=0; i<TAILLE; i++){
      tab[i] = (int)(Math.random() * 100);
    }
  }
  public TableauInt(int n){
    tab = new int[TAILLE];
    for (int i=0; i<TAILLE;i++){
      tab[i] = n + i;
    }
  }
  public String toString(){
    String s ="[";
    for(int i=0; i<TAILLE; i++){
      s += tab[i]+", ";
    }
    s += "]";
    return s;
  }
  public int rangMax(){
    int max = 0;
    for(int i=0; i<TAILLE; i++){
      if (tab[i] > max)
        max = tab[i];
    }
    return max;
  }
  public int somme(){
    int s = 0;
    for (int i=0; i<TAILLE; i++){
      s += tab[i];
    }
    return s;
  }
  public boolean egal(TableauInt t){
    for (int i=0;i < TAILLE; i++){
      if (this.tab[i] != t.tab[i]){
        return false;
      }
    }
    return true;
  }

}
