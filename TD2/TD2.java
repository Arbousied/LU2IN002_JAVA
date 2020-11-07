//Q15.1
//le premier constructeur permet de choisir la valeur de l'attribut volume dans le main tandis que l'autre permet de choisir cette valeur dans le fivhier de classe.
//Bouteille(1.5); Bouteille();
//Q15.2
//"this.volume" est la valeur de l'attribut volume de la classe Bouteille et "volume" représente la valeur donné au constructeur en paramètre.
//Q15.3
//affectation de la valeur "1.5" à l'attribut volume

public class Bouteille {
    private double volume;

    public Bouteille(double volume) {
        this.volume = volume;
    }
    public Bouteille() {
        this(1.5);
    }
    public void remplir (Bouteille b){
        this.volume = this.volume + b.volume;
	b.volume = 0;
    }
    public void remplir (double volume){
    	this.volume = this.volume + volume;
    }
    public String toString() {
        return (" Volume du liquide dans la bouteille =" + volume);
    }
}

//Q15.6
//ligne 5: 10;
//ligne 6: 1.5;
//ligne 8: 11.5;
//ligne 9: 0;
//
//Q17.1 

