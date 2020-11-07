public class TestCone{
  public static void main(String[] args){
    System.out.println(Cone.nbCones);
    Cone a = new Cone();
    Cone b = new Cone(4.3, 6.5);
    System.out.println(Cone.nbCones);
  }
}
