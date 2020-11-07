public class TestPoint{
  public static void main(String[] args){
    Point p1 = new Point();
    Point p2 = new Point();
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p2.distance(p1));
    p2.deplaceToi(4, 2);
    System.out.println(p2.toString());

  }

}
