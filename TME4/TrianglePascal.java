public class TrianglePascal{
  private int[][] tab;
  public TrianglePascal(int lignes){
    tab = new int[lignes][lignes];
  }
  public remplirTriangle(){
    int i, j = 0;
    while (tab[i][j] == null){
      while(j <= i){
        if(j == 0 || i == j){
          tab[i][j] = 1;
        }
        else{
          tab[i][j] = tab[i-1][j-1] + tab[i-1][j];
        }
        j++;
      }
      i++;
    }
  }
  public String toString(){
    String s;
    int i, j = 0;
    while (tab[i][j] != null){
      while(j <= i){
        s += tab[i][j];
        j++;
      }
      s += "\n"
      i++;
    }
    return s;
  }
}
