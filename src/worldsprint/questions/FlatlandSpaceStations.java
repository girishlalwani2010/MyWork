package worldsprint.questions;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int n=6,m=6; int c[] = {1,2,4,3,5}; Arrays.sort(c); int distancearray[] =
	 * new int[n]; int j=0; for(int i=0; i<distancearray.length; i++) {
	 * distancearray[i] = Integer.MAX_VALUE; if(c[j]==i) { distancearray[i] = 0;
	 * }
	 * 
	 * if(j<c.length-1) { j++; }
	 * 
	 * }
	 * 
	 * 
	 * for(int i=0; i<n; i++) { for(int k=0; k<c.length;k++) {
	 * 
	 * 
	 * if(distancearray[i] != 0) {
	 * 
	 * if((Math.abs(i-c[k]) !=0) && distancearray[i]>Math.abs(i-c[k])) {
	 * distancearray[i] = Math.abs(i-c[k]); } } } }
	 * 
	 * int max = distancearray[0]; for(int i=1; i<distancearray.length; i++) {
	 * if (distancearray[i] > max) { max=distancearray[i]; } }
	 * 
	 * System.out.println(max);
	 * 
	 * 
	 * }
	 */

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			c[i] = in.nextInt();
		}
		Arrays.sort(c);
		int mdx = Math.max(c[0], n - c[c.length - 1] - 1);
		for (int i = 0; i < m - 1; i++) {
			mdx = Math.max((c[i + 1] - c[i]) / 2, mdx);
		}
		System.out.println(mdx);

	}

}
