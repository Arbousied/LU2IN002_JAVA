public class TestTrianglePascal{
  public static void main(String[] args){
    TrianglePascal t1 = new TrianglePascal(5);
    t1.remplirTriangle();
    System.out.println(t1.toString());
    TrianglePascal t2 = new TrianglePascal(10);
    t2.remplirTriangle();
    System.out.println(t2.toString());
    TrianglePascal t3 = new TrianglePascal(50);
    t3.remplirTriangle();
    System.out.println(t3.toString());
  }
}
