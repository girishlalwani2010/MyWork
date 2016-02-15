package algorithms;

public class SpiralMatrix {

	public static void main(String args[])
	{
		spiral(3,3);
	}
	
	public static void spiral(int X, int Y) {
	    int x=0, y=0, dx = 0, dy = -1;
	    int t = Math.max(X,Y);
	    int maxI = t*t;

	    for (int i=0; i < maxI; i++){
	        if ((-X/2 <= x) && (x <= X/2) && (-Y/2 <= y) && (y <= Y/2)) {
	            System.out.println(x+","+y);
	            //DO STUFF
	        }

	        if( (x == y) || ((x < 0) && (x == -y)) || ((x > 0) && (x == 1-y))) {
	            t=dx; dx=-dy; dy=t;
	        }   
	        x+=dx; y+=dy;
	    }
	}
		
}
