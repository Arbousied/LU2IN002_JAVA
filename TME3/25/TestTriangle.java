public class TestTriangle{
  public static void main(String[] args){
    Point p1 = new Point();
    System.out.println(p1.toString());
    Point p2 = new Point();
    System.out.println(p2.toString());
    Point p3 = new Point();
    System.out.println(p3.toString());
    Triangle t1 = new Triangle(p1, p2, p3);
    System.out.println(t1.toString());
    System.out.println(t1.getPerimetre());
  }
}
