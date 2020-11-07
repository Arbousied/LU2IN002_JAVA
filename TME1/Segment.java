public class Segment{
	private int x,y;
	public Segment(int x1, int y1){
		x = x1;
		y = y1;
	}
	public int longueur(){
		if(x < y){
			return(y - x);
		}
		else{
			return(x - y);
		}
	}
	public String toString(){
		return "Segment[<"+x+">, <"+y+">]";
	}
}
