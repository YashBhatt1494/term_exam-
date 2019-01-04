package org.learn.java;
import java.util.*; 

public class ReverceNum {

	static int reverceNum(int n) {
		
		String s = String.valueOf(n);
		String ans="";
		char[] try1 = s.toCharArray(); 
		  
        for (int i=try1.length-1 ; i>=0; i--) {
        	ans=ans+try1[i];
        }
        
        return Integer.parseInt(ans);
            
	}
	public static void main(String[] args) {
		System.out.println(reverceNum(123));
	}
}
