public class Planete {
    private String nom;
    private double rayon; // en k i l o m e t r e
    public Planete(String n, double r) {
        nom = n;
        rayon = r;
    }
    public String toString() {
        String s = " Planete " + nom;
        s += " de rayon " + rayon;
	return s;
    }
    public double getRayon() {
        return rayon;
    }
}
