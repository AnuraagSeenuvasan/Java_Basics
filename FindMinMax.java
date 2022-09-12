package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(nums);
		System.out.println(nums[0]+" is the smallest number");
		System.out.println(nums.length-1+" is the smallest number");
		
//		for(int i=0;i<=nums.length-1;i++) {
//			if(min>nums[i]) {
//				min=nums[i];
//			}if(max<nums[i]) {
//				max=nums[i];
//			}
//		}
//		System.out.println("");
	}
}

