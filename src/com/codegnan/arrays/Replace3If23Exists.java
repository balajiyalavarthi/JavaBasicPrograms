package com.codegnan.arrays;

public class Replace3If23Exists {
	
public static int[] changeNum(int[] nums) {
	
	for(int i= 0; i<nums.length; i++) {
		
		if(nums[i]== 2 && nums[i+1]==3) {
			nums[i+1] = 0;
		}
		
	}
	return nums;
}


public static void showArray(int[] nums) {
	
	changeNum(nums);
	
	System.out.print("[");
	
	for(int num:nums) {
		System.out.print(num);
		if(num<=nums.length) {
		System.out.print(" ");
		}
			
	}
	
	System.out.println("]");
	return ;
}
	
	public static void main(String[] args) {
		
		int[] arrays = {2, 3, 0, 2, 3, 4, 1, 2, 3};
				            
		System.out.println("orginal array : ");
		System.out.println("Result : ");
		showArray(arrays);
		
	}

}
