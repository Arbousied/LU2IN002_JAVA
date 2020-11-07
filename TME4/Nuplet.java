public class Nuplet{
  private int[] array;
  public Nuplet(int n){

  }
  public Nuplet(int n, int x){
    array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = x;
    }
  }
  public Nuplet(int a, int b, int c){
    array = new int[3];
    array[0] = a;
    array[1] = b;
    array[2] = c;
  }
  public String toString(){
    if (array.length == 0)
      return "()";
    String s = "(";
    for (int i = 0; i < array.length; i++){
      s += array[i]+",";
    }
    s += ")";
    return s;
  }
  public int somme(){
    int s = 0;
    for (int i = 0; i < array.length; i++){
      s += array[i];
    }
    return s;
  }
  public static void main(String[] args){
    Nuplet pentaplet = new Nuplet(5, 3);
    Nuplet triplet = new Nuplet(7, 8, 9);
    System.out.println(pentaplet.toString());
    System.out.println(triplet.toString());
  }


}
