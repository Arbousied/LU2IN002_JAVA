public class Triangle{
  private Point a;
  private Point b;
  private Point c;
  public Triangle(Point a1, Point b1, Point c1){
    a = a1;
    b = b1;
    c = c1;
  }
  public Triangle(){
    this(new Point(), new Point(), new Point());
  }
  public int getPerimetre(){
    return ((int)(a.distance(b) + a.distance(c) + c.distance(b)));
  }
  public String toString(){
      return("coordonnées des sommets  A: "+a.toString()+"B: "+b.toString()+"c: "+c.toString());
  }
  public boolean saMe(Triangle t){
    if ((this.a.distance(this.b) == t.a.distance(t.b)) && (this.a.distance(this.c) == t.a.distance(t.c)) && (this.c.distance(this.b) == t.c.distance(t.b))){
      return true;
    else
      return false;
    }
  }
}
