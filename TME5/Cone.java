import java.lang.Math;
public class Cone{
  private double r;
  private double hauteur;
  public static double PI = 3.14159;
  public static int nbCones = 0;
  public Cone(){
    this(Math.random() * 10, Math.random() * 10);
  }
  public Cone(double r, double h){
    this.r = r;
    this.hauteur = h;
    nbCones++;
  }
  public double getVolume(){
    double volume;
    volume = 1/3*PI*r*r*hauteur;
    return volume;
  }
  public String toString(){
    String s;
    s = "Cone r="+r+" h="+hauteur+" V="+this.getVolume();
    return s;
  }
}
