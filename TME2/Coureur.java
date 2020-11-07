import java.lang.Math;
public class Coureur{
	private int numDossard;
	private double tempsau100;
	private boolean possedeTemoin;
	public Coureur(int D){
		numDossard = D;
		tempsau100 = (Math.random() * (15 - 12) + 12);
		possedeTemoin = false;
	}
	public Coureur(){
		this((int)(Math.random() * (1000 - 1) + 1));
	}
	public int getNumDossard(){
		return numDossard;
	}
	public double getTempsAu100(){
		return tempsau100;
	}
	public boolean getPossedeTemoin(){
		return possedeTemoin;
	}
	public void setPossedeTemoin(boolean b){
		possedeTemoin = b;
	}
	public void passeTemoin(Coureur c){
		if (possedeTemoin)
		{
			possedeTemoin = false;
			c.possedeTemoin = true;
			System.out.println("moi, coureur "+numDossard+", je passe le témoin au coureur "+c.numDossard);
		}
		else
		{
			System.out.println("Erreur lors du passage de témoin");
		}
	}
	public void courir(){
		System.out.println("Je suis le coureur "+numDossard+" et je cours.");
	}	
	public String toString(){
		return ("Coureur : "+numDossard+"temps au 100m : "+tempsau100+"possede le témoin ? "+possedeTemoin);
	}
}
