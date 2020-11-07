public class Histo{
  private int[] hist;
  public Histo(){
    hist = new int[21];
    for(int i=0; i < 21; i++){
      hist[i] = 0;
    }
  }
  public void addNote(int n){
    this.hist[n]++;
  }
  public Histo(int[] t){
    hist = clone(t);
  }
  public int[] clone(int[] b){
    int[] a = new int[21];
    for(int i=0; i < 21; i++){
      a[i] = b[i];
    }
    return a;
  }
  public void afficheHistogramme(){
    String s = "";
    for(int i=0; i < 21; i++){
      s = "";
      for(int j=0; j < this.hist[i];j++){
        s += "*";
      }
      if (i < 10)
        System.out.println(i+"  | "+s);
      if (i > 10)
        System.out.println(i+" | "+s);
    }
  }
  public void afficheHistogrammeTableau(){
    System.out.print("[");
    for(int i=0; i < 21; i++){
      System.out.print(this.hist[i]+", ");
    }
    System.out.println("]");
  }
}
