import java.lang.Math;
public class Point{
  private int posx;
  private int posy;
  public Point(){
    this((int)(Math.random() * (20) - 10), (int)(Math.random() * (20) - 10));
  }
  public Point(int x, int y){
    posx = x;
    posy = y;
  }
  public void setPosx(int x){
    this.posx = x;
  }
  public void setPosy(int y){
    this.posy = y;
  }
  public int getPosx(){
    return this.posx;
  }
  public int getPosy(){
    return this.posy;
  }
  public String toString(){
    return ("( "+posx+", "+posy+" )");
  }
  public int distance(Point p){
    int A = p.posx - this.posx;
    int B = p.posy - this.posy;
    return ((int)Math.sqrt(A*A + B*B));
  }
  public void deplaceToi(int newx, int newy){
    this.posy = newy;
    this.posx = newx;
  }
}
