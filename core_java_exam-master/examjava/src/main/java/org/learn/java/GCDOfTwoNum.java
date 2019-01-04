package org.learn.java;


public class GCDOfTwoNum {
	
	
	static int findGCD(int n1,int n2) {
		if(n1==n2) {
			return n1;
		} else if (n1<n2) {
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		
		int ans=0,rem=n2;
		
		while(n2!=0) {
			int temp=n2;
			n2=n1%n2;
			n1=temp;
			if(n2!=0) {
				ans=n2;
			}
			n1=temp;
		}
		
		System.out.println(ans);
		
		
		return ans;
	}
	
	int findGCD(int[] nums) {
		//int ans;
		//ans=nums[0];
		for(int i=1;i<nums.length;i++) {
			nums[0]=findGCD(nums[0],nums[i]);
		}
		return nums[0];
	}
	
	public static void main(String[] args) {
		
		
		int ans=findGCD(1701, 3768);
 	}

}
