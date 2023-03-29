package coreJavaProgramsForInterview;
//Check with first value, is matching with multiply with 2 
//into second value in array
//if it is matching print true and break the execution 
//else print false and go with next value



public class StringTest{
	public static void main(String[] args){
	int[] nums = {10, 2, 5, 3};

		for(int i =0; i<nums.length;i++){
			for(int j=i+1; j<nums.length;j++){
				if(nums[i] == (nums[j]*2)){
					System.out.println("true");
					break;
				}else{
					System.out.println("false");
				}
			}			
		}	
	}
}
