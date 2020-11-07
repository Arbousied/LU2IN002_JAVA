import java.lang.Math;
public class TestHisto{
  public static void main(String[] args){
    Histo h1 = new Histo();
    for(int i=0;i<150;i++){
      int r = (int)(Math.random() * 20);
      h1.addNote(r);
    }
    h1.afficheHistogrammeTableau();
    h1.afficheHistogramme();
  }
}
