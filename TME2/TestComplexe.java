public class TestComplexe{
	public static void main(String[] args){
		Complexe c1 = new Complexe();
		Complexe c2 = new Complexe();
		Complexe c3 = new Complexe();
		Complexe c4;
		System.out.println(c1.toString());
		System.out.println(c2.toString());
                System.out.println(c3.toString());
		assert c1.estReel() == true;
		c2.estReel();
		c3.estReel();
		c4 = c1.addComp(c2);
		System.out.println(c4.toString());
		c4 = c1.multComp(c2);
		System.out.println(c4.toString());
	}
}
