public class Couple {
    private int x, y;
    public Couple(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Couple addition(Couple a){
    	Couple aDD = new Couple((this.x + a.x), (this.y + a.y));
	return aDD;
    }
    public String toString() {
        return "(" + x + " ," + y + ")";
    }
}
