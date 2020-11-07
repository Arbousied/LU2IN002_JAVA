public class TestPion{
	public static void main(String[] args) {
  		Pion unPion=new Pion("Atchoum ");
  		System.out.println(unPion.getPoint());
		Pion autrePion= new Pion(unPion);
		autrePion.getPoint() = autrePion.getPoint().clone();
		System.out.println(autrePion.getPoint());
  		autrePion.setNom("Dormeur");
  		System.out.println(unPion.getNom());
		autrePion.getPoint().getCoord();
		unPion.getPoint().getCoord();
		autrePion.seDeplacer();
		unPion.getPoint().getCoord();
		autrePion.getPoint().getCoord();
		System.out.println(unPion.getPoint());
		System.out.println(autrePion.getPoint());
  	}
}
