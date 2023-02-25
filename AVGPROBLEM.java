// https://www.codechef.com/problems/AVGPROBLEM
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- > 0){
	        double x = s.nextInt();
	        double y = s.nextInt();
	        double z = s.nextInt();
	        double avg = (x+y)/2;
	        String res = avg>z ? "YES" : "NO";
	        System.out.println(res);
	    }
	}
}
