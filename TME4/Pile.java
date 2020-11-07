public class Pile{
  private Machin[] tab;
  public Pile(){
    tab = new Machin[30];
  }
  public void empiler(Machin m){
    int i = 0;
    while ((tab[i] != null) && (i < 30)){
      i++;
    }
    tab[i] = m;
  }
  public void depiler(){
    int i = tab.length - 1;
    while ((tab[i] == null) && (i > 0)){
      i--;
    }
    tab[i] = null;
  }
  public boolean estVide(){
    if (tab[0] == null){
      return true;
    }
    return false;
  }
  public boolean estPleine(){
    if (tab[29] != null){
      return true;
    }
    return false;
  }
  public String toString(){
    String s = "";
    int i = 0;
    while(i<29){
      if (tab[i] != null){
        s += tab[i];
      }
      i++;
    }
    return s;
  }
  public static void main(String[] args){
    Machin m1 = new Machin("kapla", 0);
    Machin m2 = new Machin("cuillere", 1);
    Machin m3 = new Machin("fourchette", 2);
    Machin m4 = new Machin("canette", 3);
    Pile p = new Pile();
    p.empiler(m1);
    System.out.println(p.toString());
    p.empiler(m2);
    System.out.println(p.toString());
    p.empiler(m3);
    System.out.println(p.toString());
    p.depiler();
    System.out.println(p.toString());
    p.depiler();
    System.out.println(p.toString());
    p.empiler(m3);
    System.out.println(p.toString());
  }
}
