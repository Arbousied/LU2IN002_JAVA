import java.lang.Math;
public class Complexe{
	private double reelle;
	private double imag;
	public Complexe(double relle, double ima){
		reelle = relle;
		imag = ima;
	}
	public Complexe(){
		this((double)(Math.random() * (2 + 2) - 2), (Math.random() * (2 + 2) - 2));
	}
	public String toString(){
		return ("("+reelle+" + "+imag+"i)");
	}
	public boolean estReel(){
		if (imag == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public Complexe addComp(Complexe c2){
		return new Complexe(this.reelle+c2.reelle, this.imag+c2.imag);
	}
	public Complexe multComp(Complexe c2){
		return new Complexe((this.reelle*c2.reelle) - (this.imag*c2.imag), (this.reelle*c2.imag) + (this.imag*c2.reelle));
	}
}
