package org.learn.java;



public class FindRoot {
	
	
	static int findRootJavaDerect(int num){
		int ans=(int) Math.sqrt(num);
		
		return ans;
	}
	
	static int findRoot(int num){
		 if (num == 0 || num == 1) 
	            return num; 
	   
        int i = 1, result = 1; 
          
        while (result <= num) { 
            i++; 
            result = i * i; 
        } 
        return i - 1; 
	}
	
	public static void main(String[] args) {
		System.out.println(findRootJavaDerect(9));
		System.out.println(findRoot(9));
	}
}
