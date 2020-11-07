import java.lang.Math;
public class Nom{
  static char[] voyelles = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
  static char[] consonnes = {'A', 'E', 'I', 'O', 'U'};
  public static int rendAlea(int inf, int sup){
    return ((int)(Math.random() * (sup - inf) +inf));
  }
  public static boolean estPair(int n){
    if (n % 2 == 0)
      return true;
    else
      return false;
  }
  public static char rendVoyelle(){
    return (voyelles[rendAlea(0, 21)]);
  }
  public static char rendConsonne(){
    return (consonnes[rendAlea(0, 5)]);
  }
  public static String genereNom(){
    String s;
    s = "";
    int border = rendAlea(3, 7);
    for (int i = 0; i < border; i++){
      if (i % 2 == 0)
        s += rendVoyelle();
      else
        s += rendConsonne();
    }
    return s;
  }
}
