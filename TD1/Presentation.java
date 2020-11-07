public class Presentation{
	public static void main(String[] args){
		Personne P = new Personne("Paul", 25);
		Personne P2 = new Personne("Pierre", 37);
		System.out.println(P2.toString());
		P.sePresenter();
		for (int i = 0; i < 10; i++){
			P.vieillir();
		}
		System.out.println(P.getAge());
	}
}
