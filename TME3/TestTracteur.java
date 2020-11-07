public class TestTracteur{
  public static void main(String[] args){
    Roue gr1 = new Roue(120);
    Roue gr2 = new Roue(120);
    Roue pr1 = new Roue();
    Roue pr2 = new Roue();
    System.out.println(gr1);
    System.out.println(gr2);
    System.out.println(pr1);
    System.out.println(pr2);
    Cabine c1 = new Cabine(3, "bleue");
    System.out.println(c1.toString());
    Tracteur t1 = new Tracteur(c1, pr1, pr2, gr1, gr2);
    System.out.println(t1.toString());
    Tracteur t2 = t1.clone();
    t2.peindre("rouge");
    System.out.println(t1.toString());
  }
}
