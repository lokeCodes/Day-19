// https://www.codechef.com/problems/CGYM
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
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    if(z<x){
		        System.out.println(0);
		    }else if(z>=x && z<x+y){
		        System.out.println(1);
		    }else{
		        System.out.println(2);
		    }
		}
	}
}
