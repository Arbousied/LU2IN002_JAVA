public class GenerateurIP{
  private GenerateurIP(){}
  public static int[] tab = {192, 168, 0, 0};
  public static String getAdresseIP(){
    if (tab[3] <= 255){
      tab[3]++;
    }
    if (tab[3] == 256){
      tab[3] = 0;
      tab[2]++;
    }
    String s;
    s = tab[0]+"."+tab[1]+"."+tab[2]+"."+tab[3];
    if (tab[2] == 255 && tab[3] == 255)
    {
      return "All IP adress have been taken";
    }
    return s;
  }

}
