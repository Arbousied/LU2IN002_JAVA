public class Personne{
	private String nom;
	private int age;
	public Personne(String n, int a){
		nom = n;
		age = a;
	}
	public String toString(){
		return "je m'appelle "+nom+" j'ai "+age+" ans";
	}
	public void sePresenter(){
                System.out.println(toString());
        }
	public int getAge(){
		return age;
	}
	public void vieillir(){
		age = age + 1;
	}

}
