import java.lang.Math;
public class Villageois{
	private String nom;
	private double poids;
	private boolean malade;
	public Villageois(String nomVillageois){
		nom = nomVillageois;
		int random_integer = (int)(Math.random() * (149 - 50)) + 50;
		poids = random_integer;
		int randomsick = (int)Math.random();
		if (randomsick > 0.20){
			malade = false;
		}
		else{
			malade = true;
		}
	}
}
